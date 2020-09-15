import java.io.*;
import java.util.*;

public class MissingNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(reader.readLine());

		while(t > 0){
			int n = Integer.parseInt(reader.readLine());

			int[] a = Arrays.stream(reader.readLine().split("\\s"))
							.mapToInt(Integer::parseInt)
							.toArray();

			int result = findMissingNumber(a, n);
			System.out.println(result);	

			t--;
		}
	}

	static int findMissingNumber(int[] a, int n){
		// {1,2,3,4,5}
		int rs = 0;
		int as = 0;
		for(int i = 1; i <= n; i++){
			rs = rs + i;
		}

		for(int j = 0 ; j < n - 1; j++){
			as = as + a[j];
		}

		return rs - as;
	}
}