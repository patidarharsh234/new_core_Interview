package com.rays.thread;

public class A_Printer extends Thread {

	private A_Storage storage;

	public A_Printer(A_Storage storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Print the value=" + storage.getValue());
		}
	}

}
