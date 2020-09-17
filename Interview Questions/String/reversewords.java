// Problem statement : https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0

import java.io.*;
import java.util.*;

public class reversewords {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());

		while(t > 0){

		String a = reader.readLine();
		String[] b = a.split("[.]+");
		for(int i = b.length - 1; i >= 0 ; i--){
			System.out.print(b[i]);

			if(i!=0)
			System.out.print(".");
		}
		System.out.println();
		t--;
	}
		
	}
}