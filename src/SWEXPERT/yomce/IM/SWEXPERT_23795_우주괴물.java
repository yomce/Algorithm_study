package SWEXPERT.yomce.IM;

import java.util.Scanner;

public class SWEXPERT_23795_우주괴물 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();

			int[][] map = new int[N][N];

			// 맵 입력
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			// 괴물 찾기
			int mr = -1;
			int mc = -1;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 2) {
						mr = i;
						mc = j;
						break;
					}
				}
			}

			// 방향키
			int[] dr = { -1, 1, 0, 0 };
			int[] dc = { 0, 0, -1, 1 };

			for (int d = 0; d < 4; d++) {
				for (int cnt = 1; cnt < N; cnt++) {
					int nr = mr + dr[d] * cnt;
					int nc = mc + dc[d] * cnt;
					if (nr < 0 || nr >= N || nc < 0 || nc >= N)
						break;
					if(map[nr][nc] == 1) break;

					map[nr][nc] = 1;
				}
			}

			// 방문 안한 곳
			int count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(map[i][j] == 0) {
						count++;
					}
				}
			}
			
			System.out.println("#"+test_case+" "+count);

		}
	}

}
