package SWEXPERT.yomce.IM;

import java.util.Scanner;

public class SWEXPERT_22375_스위치조작 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			
			int N = sc.nextInt();
			int[] bf = new int[N];
			int[] af = new int[N];
			
			for(int i = 0; i<N; i++) {
				bf[i] = sc.nextInt();
			}
			for(int i = 0; i<N; i++) {
				af[i] = sc.nextInt();
			}
			
			int count = 0;
			
			for(int i = 0; i<N; i++) {
				if(bf[i] == af[i]) continue;
				
				for(int j = i; j<N; j++) {
					bf[j] = 1 - bf[j];
				}
				
				count++;
			}
			
			System.out.println("#"+test_case+" "+count);
			
		}
	}
}
