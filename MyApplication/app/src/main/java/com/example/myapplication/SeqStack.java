package com.example.myapplication;


public class SeqStack<T> implements Stack<T>{
   private SeqList<T> list;
   public SeqStack(int length){
	   this.list = new SeqList<T>(length);
   }
   public SeqStack(){
	   this(64);
   }
	 
   public boolean isEmpty(){
	   return this.list.isEmpty();
   }
   public void push(T x){
	   this.list.insert(x);
   }
   public T peek(){
	   return this.list.get(list.size()-1);
   }
   public T pop(){
	   return list.remove(list.size()-1);
   }
   /*public boolean equals(T name1,T name2){
	   if(name1 == name2){
		   return true;
	   }
	   else {
		   return false;
	   }
   }*/
   public void clear(){
	   list.clear();
   }
   public int size(){
	  return  list.size();
   }
   public T get(int i){
	   return this.list.get(i);
   }
}
