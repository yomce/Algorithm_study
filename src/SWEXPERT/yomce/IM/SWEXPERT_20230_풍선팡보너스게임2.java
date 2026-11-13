package SWEXPERT.yomce.IM;

import java.util.Scanner;

public class SWEXPERT_20230_풍선팡보너스게임2 {
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static int N, ans;
	static int[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			map = new int[N][N];
			ans = 0;
			
			// 풍선 맵
			for(int r = 0; r < N; r++) {
				for(int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();
				}
			}
			
			for(int r = 0; r<N; r++) {
				for(int c = 0; c < N; c++) {
					calc(r, c, 0, 4);
				}
			}
			
			System.out.println("#"+test_case+" "+ans);
			
		}
		
	}

	private static void calc(int r, int c, int start, int end) {
		int sum = map[r][c];
		
		for(int d = start; d<end; d++) {
			for(int cnt = 1; cnt < N; cnt++) {
				int nr  = r + dr[d]*cnt;
				int nc  = c + dc[d]*cnt;
				if(nr < 0 || nr >= N || nc < 0 || nc >= N) break;
				
				sum += map[nr][nc];
			}
		}
		ans = Math.max(ans, sum);
	}
}
