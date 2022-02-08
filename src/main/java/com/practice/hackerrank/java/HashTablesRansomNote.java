package com.practice.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.HashedMap;

public class HashTablesRansomNote {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int m = Integer.parseInt(firstMultipleInput[0]);

		int n = Integer.parseInt(firstMultipleInput[1]);

		List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.collect(toList());

		List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).collect(toList());

		WordMatcher.checkMagazine(magazine, note);

		bufferedReader.close();
	}
}

class WordMatcher {
	public static void checkMagazine(List<String> magazine, List<String> note) {
		// Write your code here
		boolean willWork = true;
		IterableMap<String, Integer> noteWords = new HashedMap<String, Integer>();
		noteWords =	(IterableMap<String, Integer>) wordCountMap(note);
		HashMap<String, Integer> magWords = wordCountMap(magazine);
		MapIterator<String, Integer> iterator = noteWords.mapIterator();
		
		while(iterator.hasNext()) {
			if (magWords.containsKey(iterator.next())) {
				Integer noteWordsCount = noteWords.get(iterator.next());
				Integer magwordsCount = magWords.get(iterator.next());
				if (noteWordsCount.equals(magwordsCount)) {
					willWork = true;
				} 
				
			}
		}
		if (willWork) 
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static HashMap<String, Integer> wordCountMap(List<String> words) {
		HashMap<String, Integer> wordMap = new HashMap<>();
		HashSet<String> unqWords = new HashSet<>();
		unqWords.addAll(words);
		for (String s : unqWords) {
			wordMap.put(s, Collections.frequency(words, s));
		}

		return wordMap;
	}

}