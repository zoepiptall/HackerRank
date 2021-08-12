package com.practice.hackerrank.java;

import java.util.ArrayList;
import java.util.List;

public class CloudJump {

	public static void main(String[] args) {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT__PATH")));
		
//		int n = Integer.parseInt(bufferedReader.readLine().trim());
		int n = 7;
		
		List<Integer> c = new ArrayList<>();
		c.add(0);
		c.add(0);
		c.add(1);
		c.add(0);
		c.add(0);
		c.add(1);
		c.add(0);
		c.add(0);
		c.add(0);
		
//		List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "));
		
		int result = Jumper.jumpingOnClouds(c);
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
		
//		bufferedReader.close();
//		bufferedWriter.close();
	}

}

class Jumper {
	public static int jumpingOnClouds(List<Integer> c) {
		int dodge = 0;
		for (int i = 0; i < c.size(); i++, dodge++) {
			
			if (i<c.size()-2 && c.get(i+2).intValue()==0) {
				i++;
			}
			
		}

		return dodge-1;
	}
}


