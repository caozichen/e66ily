package com.example.text3;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Environment;
import android.os.Handler;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //主线程创建handler，在子线程中通过handler的post(Runnable)方法更新UI信息。
    private Handler myHandler = new Handler();

    private MediaPlayer mediaPlayer = new MediaPlayer();
    private SeekBar seekBar;
    private TextView timeTextView;
    //进度条下面的当前进度文字，将毫秒化为m:ss格式
    private SimpleDateFormat time = new SimpleDateFormat("m:ss");

    private int i = 0;//当前歌曲序号

    File pFile = Environment.getExternalStorageDirectory();//SD卡根目录
    //歌曲路径
    private String[] musicPath = new String[]{
             "/sdcard/Music/Finger & Kadel - Kalinka (Svetlanas Original Mix).mp3",
            "/sdcard/Music/DJ Blyatman,Russian Village Boys - Cyka Blyat.mp3",
            "/sdcard/Music/Welcome To New York.mp3",
//            pFile + "/MyTestMusic/Adele-Someone Like You.ape",
//            pFile + "/MyTestMusic/Taylor Swift - Love Story.mp3",
//            pFile + "/MyTestMusic/感同身受_林宥嘉.flac"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button play = (Button) findViewById(R.id.play);
        Button stop = findViewById(R.id.stop);
        Button pause = findViewById(R.id.pause);
        Button nextMusic = findViewById(R.id.next);
        Button preMusic = findViewById(R.id.previous);

        play.setOnClickListener(this);
        stop.setOnClickListener(this);
        pause.setOnClickListener(this);
        nextMusic.setOnClickListener(this);
        preMusic.setOnClickListener(this);

        seekBar = findViewById(R.id.seekbar);
        timeTextView = findViewById(R.id.text1);

        //运行时权限处理，动态申请WRITE_EXTERNAL_STORAGE权限
        //PackageManager.PERMISSION_GRANTED 表示有权限， PackageManager.PERMISSION_DENIED 表示无权限
        if(ContextCompat.checkSelfPermission(MainActivity.this,Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
            //这里会调用后面的onRequestPermissionResult
        }else{
            initMediaPlayer(0);
        }

        myHandler.post(updateUI);
    }

    private void initMediaPlayer(int musicIndex){
        try {
            //File file = new File(pFile,"Adele-Someone Like You.ape");
            mediaPlayer.setDataSource(musicPath[musicIndex]);//指定音频文件路径
            mediaPlayer.prepare();//让MediaPlayer进入到准备状态
        }catch(Exception e){
            e.printStackTrace();
        }

        //这个要放在指定音频文件路径之后
        seekBar.setMax(mediaPlayer.getDuration());
        //拖动进度条时应该发生的事情
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //如果不判断是否来自用户操作进度条，会不断执行下面语句块里面的逻辑
                if(fromUser){
                    mediaPlayer.seekTo(seekBar.getProgress());
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    //拒绝权限获取则直接关闭程序
    public void onRequestPermissionsResult(int requestCode,String[] permissions,int[] grantResults){
        switch (requestCode){
            case 1:
            {
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    initMediaPlayer(0);
                }else{
                    Toast.makeText(this,"拒绝权限将无法使用程序",Toast.LENGTH_SHORT).show();
                    finish();
                }
                break;
            }
            default:
                break;
        }
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.play:
                if(!mediaPlayer.isPlaying()){
                    mediaPlayer.start();
                }
                break;
            case R.id.pause:
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }
                break;
            case R.id.stop:
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.reset();
                    initMediaPlayer(i);
                }
                break;
            case R.id.next:
                playNextMusic();
                break;
            case R.id.previous:
                playPreMusic();
                break;
            default:
                break;
        }
    }

    private void playNextMusic(){
        if(mediaPlayer != null && i < 4 && i >=0){
            mediaPlayer.reset();//没有reset会报IllegalStateException
            switch (i){
                case 0: case 1: case 2:
                    initMediaPlayer(i+1);
                    i = i + 1;
                case 3:
                    initMediaPlayer(0);
            }
            if(!mediaPlayer.isPlaying()){
                mediaPlayer.start();
            }
        }
    }

    private void playPreMusic(){
        if(mediaPlayer != null && i < 4 && i >=0){
            mediaPlayer.reset();//没有reset会报IllegalStateException
            switch (i){
                case 1: case 2: case 3:
                    initMediaPlayer(i-1);
                    i = i - 1;
                case 0:
                    initMediaPlayer(3);
            }
            if(!mediaPlayer.isPlaying()){
                mediaPlayer.start();
            }
        }
    }

    //更新UI
    private Runnable updateUI = new Runnable() {
        @Override
        public void run() {
            //获取歌曲进度并在进度条上展现
            seekBar.setProgress(mediaPlayer.getCurrentPosition());
            //获取播放位置
            timeTextView.setText(time.format(mediaPlayer.getCurrentPosition()) + "s");
            myHandler.postDelayed(updateUI,1000);
        }

    };


    //释放资源
    protected void onDestroy(){
        super.onDestroy();
        //handler发送是定时1000s发送的，如果不关闭，MediaPlayer release了还在getCurrentPosition就会报IllegalStateException错误
        myHandler.removeCallbacks(updateUI);
        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }
}