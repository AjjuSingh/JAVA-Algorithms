import java.util.*;
import java.io.*;

public class CountTriplet {
	public static void main(String[] args) throws IOException {
		// Taking input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());

		while(t > 0 ){
			int n = Integer.parseInt(reader.readLine());
			
			int[] array = Arrays.stream(reader.readLine().split("\\s"))
							.mapToInt(Integer::parseInt)
							.toArray();

			// Sort the array
			Arrays.sort(array);

			
			int count = 0;
			// Iterate over the array
			for(int i = n - 1 ; i > 1; i--){
				int j = 0;
				int k = i - 1;

				while(j < k){
					if(array[j] + array[k] == array[i]){
						count++;
						j++;
						k--;
					}
					else if(array[j] + array[k] < array[i]){
						j++;
					}
					else 
						k--;
				}
			}

			if(count!=0)
				System.out.println(count);
			else
				System.out.println("-1");
			t--;
		
			}
			
	}
}