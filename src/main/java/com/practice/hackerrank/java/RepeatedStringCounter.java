package com.practice.hackerrank.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
//		int intN = (int) n;
		
		long result = SubStringCounter.repeatedString(s, n);

//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();
//
//	        bufferedReader.close();
//	        bufferedWriter.close();
	}

}

class SubStringCounter {
	public static long repeatedString(String s, long n) {
		long subStrReps = 0;
		char charToCount = s.charAt(0);
		System.out.println(charToCount);
		long cycles = n / (long)s.length();
		long partialCycles = n % (long)s.length();
		System.out.println("number of cycles " + cycles);
		for(char c: s.toCharArray()) {
//				System.out.println("In for each loop");
			if(c == charToCount) {
//					System.out.println("In if statement");
				subStrReps++;
			}
		}
		subStrReps = subStrReps*cycles;
		
		for(char c: s.substring(0, (int)partialCycles).toCharArray()) {
//			System.out.println("In for each loop");
		if(c == charToCount) {
//				System.out.println("In if statement");
			subStrReps++;
		}
	}
//		for(long i=0; i<cycles; i++) {
//			System.out.println("In for loop");
//			
//		}
		System.out.println(subStrReps);
		return subStrReps;
	}
}
