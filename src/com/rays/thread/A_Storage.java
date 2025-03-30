package com.rays.thread;

public class A_Storage {
	
	private int value;

	public synchronized int getValue() {
		System.out.println("getValue befour wait ");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("return getValue after wait");
		return value;
	}

	public synchronized void setValue(int value) {
		System.out.println("set value befour notify");
		this.value = value;
		  notify();
		  System.out.println("set value after notify");
	}
	
	

}
