package com.practice.hackerrank.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		
		//Write your code here
		NumberFormat usFormat = NumberFormat.getCurrencyInstance();
		String us = usFormat.format(payment);
		
		Locale ind = new Locale("en", "IN");
		NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(ind);
		String india = indiaFormat.format(payment);
		
		Locale ch = new Locale("ch", "CH");
		NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(ch);
		String china = chinaFormat.format(payment);
		
		Locale fr = new Locale("fr", "FR");
		NumberFormat franceFormat = NumberFormat.getCurrencyInstance(fr);
		String france = franceFormat.format(payment);
		
		System.out.println("US: " + us + "\nIndia: " + india + "\nChina: " + china + "\nFrance: " + france);

	}

}
