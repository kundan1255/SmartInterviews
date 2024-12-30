//https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/max-element-in-array?page=0&pageSize=10

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MaxElement {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int numOfElements = Integer.valueOf(br.readLine());

		int arr[] = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

		int max = arr[0];
		for (int i = 1; i < numOfElements - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(max);

	}
}
