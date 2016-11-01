package com.module.algorithms;

class A {
	void method() {
		System.out.println("A");
	}

	void method2() {
		System.out.println("A2");
	}
}

class B extends A {
	void method2() {
		System.out.println("B");
	}

	void method3() {
		System.out.println("B3");
	}
}

public class Solution {
	public static void main(String[] args) {
		B a = new B();
		a.method2();
		a.method3();
	}

}
