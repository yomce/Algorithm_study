package SWEXPERT.yomce.IM;

import java.util.Scanner;

public class SWEXPERT_10760_우주선착륙2 {
	static int N, M, ans;
	static int[][] map;
	static int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
	static int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			N = sc.nextInt();
			M = sc.nextInt();

			map = new int[N][M];

			ans = 0;

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < M; c++) {
					map[r][c] = sc.nextInt();

				}
			}

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < M; c++) {

					calc(r, c);
				}
			}
			
			
			System.out.println("#" + test_case + " " + ans);
		}
	}

	private static void calc(int r, int c) {

		int count = 0;
		
		for(int d = 0; d<8; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			
			// 범위
			if(nr <0 || nr>=N || nc < 0 || nc >=M) continue;
			
			// 현재 위치보다 낮은 지역
			if(map[nr][nc] < map[r][c]) {
				count++;
			}
			
		}
		
		if(count >= 4) {
			ans++;
		}
	}
}
