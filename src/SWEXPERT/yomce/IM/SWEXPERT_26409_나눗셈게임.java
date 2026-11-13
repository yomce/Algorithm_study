package SWEXPERT.yomce.IM;

import java.util.Scanner;

public class SWEXPERT_26409_나눗셈게임 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int ans = 0;
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j<N; j++) {
					ans += arr[i]%arr[j];
				}
			}
			
			
			
			System.out.println("#"+test_case+" "+ans);
		}
	}
}
