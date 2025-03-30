package com.rays.thread;

public class A_TestPrintValue {
	public static void main(String[] args) {
	A_Storage s=new A_Storage();	
	
	A_Counter c=new A_Counter(s);
	A_Printer p=new A_Printer(s);
	
	
	c.start();
	p.start();
	
	
	
	}
}
