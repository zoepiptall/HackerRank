package com.practice.hackerrank.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EqualizeArray {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		arr.add(3);
		arr.add(3);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		
		int result = Equalizer.equalizeArray(arr);
		System.out.println(result);

	}

}

class Equalizer{
	public static int equalizeArray(List<Integer> arr) {
		//Write code here
		Integer maxUnq = 0 ;
		Integer arrVal = 0 ;
		Set<Integer> unq = new HashSet<Integer>();
		unq.addAll(arr);
		for(Integer i: unq) {
			int count = Collections.frequency(arr, i);
			if(count > maxUnq) {
				maxUnq = count;
				arrVal = i;
			}
		}
		int startSize = arr.size();
		while (arr.contains(arrVal)) {
			arr.remove(arrVal);
		}
		int endSize = arr.size();
		return startSize - endSize;
	}
}
