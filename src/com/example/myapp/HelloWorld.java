package com.example.myapp;

public class HelloWorld {

	String myString;

	void shout() {
		myString = "Hello World!";
		for (int i = 0; i < 3; i++) {
			System.out.println(myString);
		}
	}

	public static void main(String[] args) {

		HelloWorld myHelloWorld = new HelloWorld();
		int b = 5;
		while (b > 0) {
			myHelloWorld.shout();
			b--;
		}
	}
}
