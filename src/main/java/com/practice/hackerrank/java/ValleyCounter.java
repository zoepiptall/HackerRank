package com.practice.hackerrank.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValleyCounter {

	public static void main(String[] args) throws IOException {

//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//		int steps = Integer.parseInt(bufferedReader.readLine().trim());
//		String path = bufferedReader.readLine();
		
		int steps = 8;
		
		String path = "UDDDUDUU";
		
		int result = Vcounter.countingValleys(steps, path);
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
		
//		bufferedReader.close();
//		bufferedWriter.close();
	}

}

class Vcounter{
	public static int countingValleys(int steps, String path) {
		int lvl = 0;
		int valleys = 0;
		
		for(char c: path.toCharArray()) {
			if(c == 'U') lvl++;
			if(c == 'D') lvl--;
			
			if(lvl == 0 && c == 'U') valleys++;
		}
		return valleys;
	}
}
