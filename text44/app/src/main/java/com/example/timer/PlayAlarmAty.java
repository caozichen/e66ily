package com.example.timer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
public class PlayAlarmAty extends Activity {

    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mp = MediaPlayer.create(this,R.raw.clockmusic2);
        mp.start();
        new AlertDialog.Builder(PlayAlarmAty.this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("闹钟")
                .setMessage("快完成你制定的计划吧!!!")
                .setNegativeButton("关闭", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        PlayAlarmAty.this.finish();
                        mp.stop();

                    }
                })
                .show();

    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
    protected void onDestroy(){
        super.onDestroy();

        mp.stop();
        mp.release();
    }

}
