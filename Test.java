package com.module.basics;

class Base {
	int value = 0;

	Base() {
		System.out.println("One called");
		addValue();
	}

	void addValue() {
		System.out.println("Ones");
		value += 10;
	}

	int getValue() {
		return value;
	}
}

class Derived extends Base {
	Derived() {
		System.out.println("Twos");
		addValue();
	}

	void addValue() {
		System.out.println("Two called");
		value += 30;
	}
}

public class Test {
	public static void main(String[] args) {
		Derived b = new Derived();
		System.out.println(b.getValue());
	}
}