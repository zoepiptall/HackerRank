package com.practice.hackerrank.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.beans.factory.ListableBeanFactory;

public class ArrayManipulation {
	public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int m = Integer.parseInt(firstMultipleInput[1]);
//
//        List<List<Integer>> queries = new ArrayList<>();
//
//        IntStream.range(0, m).forEach(i -> {
//            try {
//                queries.add(
//                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        long result = Manipulator.arrayManipulation(n, queries);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
		int n = 10;
		List<List<Integer>> queries = new ArrayList<>();
		List<Integer> input1 = new ArrayList<>();
		List<Integer> input2 = new ArrayList<>();
		List<Integer> input3 = new ArrayList<>();
		List<Integer> input4 = new ArrayList<>();
		input1.add(5);
		input1.add(3);
		queries.add(input1);
		input2.add(1);
		input2.add(2);
		input2.add(100);
		queries.add(input2);
		input3.add(2);
		input3.add(5);
		input3.add(100);
		queries.add(input3);
		input4.add(3);
		input4.add(4);
		input4.add(100);
		queries.add(input4);

		long result = Manipulator.arrayManipulation(n, queries);
		System.out.println(result);
	}
}
	class Manipulator{
    	/*
         * Complete the 'arrayManipulation' function below.
         *
         * The function is expected to return a LONG_INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. 2D_INTEGER_ARRAY queries
         */

        public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
            long[] numbers = new long[n + 1];

            for(int i = 0; i < queries.size(); i++)
            {
                int a = queries.get(i).get(0) - 1;
                int b = queries.get(i).get(1);
                int k = queries.get(i).get(2);

                numbers[a] += k;
                numbers[b] -= k;
            }
 
            // Calculate sum(s)
            long maxValue=0;
            for(int i = 1; i < numbers.length; i++)
            {
                numbers[i] += numbers[i - 1];
                if(numbers[i]>maxValue)
                {
                     maxValue=numbers[i];
                }
            }

            return maxValue;
        }
        

}
