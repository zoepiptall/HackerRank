package com.practice.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {
	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//		int t = Integer.parseInt(bufferedReader.readLine().trim());
//
//		for (int tItr = 0; tItr < t; tItr++) {
//			int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//			String[] qTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//			List<Integer> q = new ArrayList<>();
//
//			for (int i = 0; i < n; i++) {
//				int qItem = Integer.parseInt(qTemp[i]);
//				q.add(qItem);
//			}
//
//			ChaosChecker.minimumBribes(q);
//		}
//
//		bufferedReader.close();
		Integer[] qTemp = { 1, 2, 5, 4, 3, 6 };
		List<Integer> q = new ArrayList<>();
		for (Integer i : qTemp) {
			q.add(i);
		}
		ChaosChecker.minimumBribes(q);
	}
}

class ChaosChecker {
	public static void minimumBribes(List<Integer> q) {
		int bribes = 0;
		for (int i = q.size() - 1; i >= 0; i--) {
			if (q.get(i) != i + 1) {
				if ((i - 1) >= 0 && q.get(i - 1) == i + 1) {
					int temp = q.get(i - 1);
					q.set(i - 1, q.get(i));
					q.set(i, temp);
					bribes++;
					System.out.println("one " + q + bribes);
				} else if ((i - 2) >= 0 && q.get(i - 2) == i + 1) {
					int temp = q.get(i - 2);
					q.set(i - 2, q.get(i - 1));
					q.set(i - 1, q.get(i));
					q.set(i, temp);
					bribes += 2;
					System.out.println("two " + q + bribes);
				} else {
					System.out.println("Too chaotic");
					return;
				}

			}
		}
		System.out.println(bribes);
	}

}