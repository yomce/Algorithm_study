package SWEXPERT.yomce.D2;

import java.util.Scanner;

public class Q1979 {
	/**
	  1 
	  5 3 
	  0 0 1 1 1 
	  1 1 1 1 0 
	  0 0 1 0 0 
	  0 1 1 1 1 
	  1 1 1 0 1
	 */

	static int N, K, ans;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			K = sc.nextInt();
			ans = 0;

			int[][] mapR = new int[N][N];
			int[][] mapC = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					mapR[i][j] = mapC[j][i] = sc.nextInt();
				}
			}

			for (int i = 0; i < N; i++) {
				count(mapR[i]);
				count(mapC[i]);
			}

			System.out.println("#" + test_case + " " + ans);

		}

	}

	static void count(int[] arr) {
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			if (arr[i] == 0) {
				if (cnt == K) {
					ans++;
				}
				cnt = 0;
			} else {
				cnt++;
			}
		}
		if (cnt == K) {
			ans++;
		}

	}

}


