package com.rays.oop;

public class DogChildOfAnimal extends Animal {

	public void sound() {
		System.out.println("this is dog");
	}

	public static void main(String[] args) {
		Animal a = new DogChildOfAnimal();
		a.sound();
	

	}
}
