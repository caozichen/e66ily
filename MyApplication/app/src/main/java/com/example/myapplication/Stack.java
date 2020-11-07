package com.example.myapplication;

public interface Stack <T>{

		public abstract boolean isEmpty();
		public abstract void push(T x);
		public abstract T peek();
		public abstract T pop();   //90
		//public abstract boolean equals(T name1,T name2);
}
