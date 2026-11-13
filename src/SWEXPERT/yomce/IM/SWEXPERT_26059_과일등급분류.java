package SWEXPERT.yomce.IM;

import java.util.Scanner;

public class SWEXPERT_26059_과일등급분류 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			
			int N = sc.nextInt();
			int min = sc.nextInt();
			int max = sc.nextInt();
			
			// 점수 배열
			int[] scores = new int[10001];
			
			for(int i = 0; i<N; i++) {
				scores[sc.nextInt()]++;
			}
			
			// 누적합
			for(int i=1; i<=10000; i++) {
				scores[i] += scores[i-1];
			}
			
			int sum1, sum2, sum3;
			int ans = Integer.MAX_VALUE;
			
			for(int i = 1; i<=9998; i++) {
				if(scores[i] < min || scores[i] > max) continue;
				sum1 = scores[i];
				
				for(int j = i+1; j<=9999; j++) {
					sum2 = scores[j] - scores[i];
					sum3 = scores[10000] - scores[j];
					if(sum2 < min || sum2 > max || sum3 < min || sum3 > max) continue;
					
					
					ans = Math.min(ans,(Math.max(sum1, Math.max(sum2, sum3) ) 
										- Math.min(sum1, Math.min(sum2, sum3)))
							);
					
				}
			}
			System.out.println("#"+test_case+" "+(ans == Integer.MAX_VALUE ? -1 : ans));
		}
	}
}
