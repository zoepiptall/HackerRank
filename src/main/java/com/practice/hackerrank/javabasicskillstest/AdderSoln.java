package com.practice.hackerrank.javabasicskillstest;

import java.util.Scanner;

import com.practice.hackerrank.java.Calculator;

public class AdderSoln {

	public static void main(String[] args) {
		int a, b;
		try (Scanner scan = new Scanner(System.in)){
			a = scan.nextInt();
			b = scan.nextInt();
		}
		
		Calculator adderObject = new Adder();
		
		System.out.println("The sum is: " + adderObject.add(a, b));
	}

}

class Adder extends Calculator{

	@Override
	public int add(int a, int b) {

		return a + b;
	}
	
}
