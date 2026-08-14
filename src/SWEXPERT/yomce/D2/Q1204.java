package SWEXPERT.yomce.D2;

import java.util.Arrays;
import java.util.Scanner;

public class Q1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int num = sc.nextInt();
			int[] cnt = new int[101];
			int max_idx = 0;
			int max = 0;
			for(int i =0; i<1000; i++) {
				int score = sc.nextInt();
				for(int j=0; j<cnt.length; j++) {
					if(score == j) {
						cnt[j]++;
					}
					
				}
//				System.out.println(Arrays.toString(cnt));;
												
			}
			
			for (int e; e < cnt.length; e++) {
				
			}
			
			System.out.println(max);
			
		}
	}
}
