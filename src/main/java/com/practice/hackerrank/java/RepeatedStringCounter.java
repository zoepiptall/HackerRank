package com.practice.hackerrank.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedStringCounter {
	public static void main(String[] args) throws IOException {
//	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//	        String s = bufferedReader.readLine();
//
//	        long n = Long.parseLong(bufferedReader.readLine().trim());

		String s = "a";
		long n = 1000000000000l;

		long result = SubStringCounter.repeatedCharA(s, n);

//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();
//
//	        bufferedReader.close();
//	        bufferedWriter.close();
	}

}

class SubStringCounter {
//For a string consisting of infinite repetitions of String s, counts the number of instances of the first character of the string
	public static long repeatedCharAt0(String s, long n) {

		long subStrReps = 0;
		char charToCount = s.toLowerCase().charAt(0);
		long cycles = n / (long) s.length();
		long partialCycles = n % (long) s.length();
		for (char c : s.toLowerCase().toCharArray()) {
			if (c == charToCount) {
				subStrReps++;
			}
		}
		subStrReps = subStrReps * cycles;

		for (char c : s.toLowerCase().substring(0, (int) partialCycles).toCharArray()) {
			if (c == charToCount) {
				subStrReps++;
			}
		}
		return subStrReps;
	}

	public static long repeatedCharA(String s, long n) {
		long subStrReps = 0;
		
		long cycles = n / (long) s.length();
		long partialCycles = n % (long) s.length();
		for (char c : s.toLowerCase().toCharArray()) {
			if (c == 'a') {
				subStrReps++;
			}
		}
		subStrReps = subStrReps * cycles;

		for (char c : s.toLowerCase().substring(0, (int) partialCycles).toCharArray()) {
			if (c == 'a') {
				subStrReps++;
			}
		}
		return subStrReps;

	}
}
