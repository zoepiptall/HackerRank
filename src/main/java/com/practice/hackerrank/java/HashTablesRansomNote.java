package com.practice.hackerrank.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.HashedMap;
/*
 * 
 */
public class HashTablesRansomNote {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        WordMatcher.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}

class WordMatcher {
	public static void checkMagazine(List<String> magazine, List<String> note) {
		// Store and count the words in the magazine in a hashmap
				HashMap<String, Integer> unqWordsAndCount = new HashMap<String, Integer>();
				for (String magWord : magazine) {
					if (unqWordsAndCount.containsKey(magWord)) {
						unqWordsAndCount.put(magWord, unqWordsAndCount.get(magWord) + 1);
					} else {
						unqWordsAndCount.put(magWord, 1);
					}
				}

				// Iterate through the hash map and compare the note words for presence and
				// count in magazine
				for (String rnword : note) {
					//if it has the work but there are not enough of that word in the magazine
					if (unqWordsAndCount.containsKey(rnword)) {
						unqWordsAndCount.put(rnword, unqWordsAndCount.get(rnword) - 1);
						if (unqWordsAndCount.get(rnword) < 0) {
							System.out.println("No");
							return;
						}
					// if the word is not found in the magazine
					}else {
						System.out.println("No");
						return;
					}
				}
				// All the words in the note are in the magazine with at least as many as needed for the note
				System.out.println("Yes");
	}

}