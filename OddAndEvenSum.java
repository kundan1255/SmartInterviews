https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/odd-and-even-sum?page=0&pageSize=10

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class OddandEvenSum {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int numOfElements = Integer.parseInt(br.readLine());

		int arr[] = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < numOfElements; i++) {
			if (arr[i] % 2 == 0) {
				evenSum = evenSum + arr[i];

			} else {
				oddSum = oddSum + arr[i];
			}
		}
		System.out.print(oddSum + " " + evenSum);

	}

}
