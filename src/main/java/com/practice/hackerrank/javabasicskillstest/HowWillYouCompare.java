package com.practice.hackerrank.javabasicskillstest;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HowWillYouCompare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Compare comp = new Compare();

		int testCases = Integer.parseInt(scan.nextLine());
		while (testCases-- > 0) {
			int condition = Integer.parseInt(scan.nextLine());
			switch (condition) {
			case 1:
				String s1 = scan.nextLine().trim();
				String s2 = scan.nextLine().trim();
				
				System.out.println( (comp.compare(s1, s2)) ? "Same" : "Different" );
				break;
			case 2: 
				int mun1 = scan.nextInt();
				int num2 = scan.nextInt();
				
				System.out.println( (comp.compare(mun1, num2)) ? "Same" : "Different");
				if(scan.hasNext()) {
					scan.nextLine();
				}
				break;
			case 3:
				//create and fill arrays
				int[] array1 = new int[scan.nextInt()];
				int[] array2 = new int[scan.nextInt()];
				
				for( int i =0; i< array1.length; i++) {
					array1[i] = scan.nextInt();
				}
				for( int i =0; i< array2.length; i++) {
					array2[i] = scan.nextInt();
				}
				
			

			}
		}

	}

}

class Compare {
	boolean compare(int a, int b) {

		if(a==b) {
			return true;
		}else {
			return false;
		}
	}

	boolean compare(String a, String b) {

		if (Objects.equals(a, b)) {
			return true;
		}else {
			return false;
		}
	}

	boolean compare(int[] a, int[] b) {
		Object[] objArr1 = {a};
		Object[] objArr2 = {b};
		
		if (Arrays.deepEquals(objArr1, objArr2)) {
			return true;
		}else {
			return false;
		}
//		if(a.length == b.length) {
//			for(int i=0; i<a.length; i++) {
//				if (a[i]!=b[i]) {
//					return false;
//				}else {
//					return true;
//				}
//			}
//		}
//		return false;
	}

}
