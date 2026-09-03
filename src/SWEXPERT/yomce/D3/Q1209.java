package SWEXPERT.yomce.D3;

import java.util.Scanner;

public class Q1209 {
	static int max;
	static int N = 100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		

		for (int test_case = 1; test_case <= T; test_case++) {
			
			int tc = sc.nextInt();
			max = 0;
			
			int[][] mapR = new int[100][100];
			int[][] mapC = new int[100][100];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					mapR[i][j] = mapC[j][i] = sc.nextInt();
				}
			}
			int sum1 = 0;
			int sum2 = 0;
			
			// 대각선 1
			for(int i = 0; i < N; i++) {
				sum1 += mapR[i][i];
				if(max<sum1) {
					max = sum1;
				}
			}
			// 대각선 2
			for(int i = 0; i < N; i++) {
				sum2 += mapR[N-1-i][i];
				if(max<sum2) {
					max = sum2;
				}
			}
			
			
			for(int i=0; i<N; i++) {
				count(mapR[i]);
				count(mapC[i]);
			}
			
			System.out.println("#" + tc + " " + max);

		}
	}
	
	static void count(int[] arr) {
		int sum = 0;
		
		for(int i =0; i<N; i++) {
			sum += arr[i];
			if(max < sum ) {
				max = sum;
			}
		}
	}
}
