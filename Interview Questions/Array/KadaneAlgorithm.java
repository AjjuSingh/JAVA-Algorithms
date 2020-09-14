/*
*	Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
*/

import java.io.*;
import java.util.*;

public class KadaneAlgorithm {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(reader.readLine());

		while(t > 0 ){
			int n = Integer.parseInt(reader.readLine());

			int[] array = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

			int result = findMax(array, n);
			
			System.out.println(result);
			
			t--;	
		}
		

	}

	static int findMax(int[] a, int n){

		int localSum = a[0];
		int globalSum = a[0];

		for(int i = 1 ; i < n ; i++){
			localSum = Math.max(a[i], localSum + a[i]);
			globalSum = Math.max(localSum, globalSum);
		}
		return globalSum;
	}
}