import java.util.*;
import java.io.*;

public class SubarraySum {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Inputs T for test cases
		int T = Integer.parseInt(reader.readLine());

		while(T > 0){
		String[] inputs = reader.readLine().split(" ");
		int N =  Integer.parseInt(inputs[0]);
		long s = Integer.parseInt(inputs[1]);

		long[] array = new long[N];

		long sum = 0;
		int i,j = 0;

		// Input values to array
		String[] arrayIP = reader.readLine().split(" ");
		for(int k = 0; k < N; k++){
			array[k] = Integer.parseInt(arrayIP[k]);
		}
		boolean found = false;

		outerloop:
		for( i = 0 ; i < array.length; i++){
			//System.out.println("Iteration for i = " + (i + 1));
			sum = array[i];
			// Looping on subarray
			for(j = i+1 ; j < array.length; j++){
				
				// System.out.println("\tIteration for j = " + (j + 1));
				sum = array[j] + sum;
				// System.out.println("\t\tSum = " + sum);

			if(sum == s){
				// lastIndex = j;
				found = true;
				System.out.println(i+1 + " " + (j+1));
				break outerloop;
					}
				}
			}
			if(found == false)
				System.out.println(-1);
			T--;
		}
	}
}