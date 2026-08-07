package SWEXPERT.yomce.D1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int median = arr[N/2];
//		System.out.println(Arrays.toString(arr));
		System.out.println(median);
		
	}
}
