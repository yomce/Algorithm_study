package SWEXPERT.yomce.D2;

import java.util.Scanner;

public class Q12712 {
	static int N, M, ans;
	static int[][] map;
	
	//방향키
	static int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1  };
	static int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			
			for(int test_case=1; test_case<=T; test_case++) {
				N = sc.nextInt();
				M = sc.nextInt();
				map = new int[N][N];
				
				for(int r =0; r<N; r++) {
					for(int c=0; c<N; c++) {
						map[r][c] = sc.nextInt();
					}
				}
				
				//계산로직 넘기기
				for(int r =0; r<N; r++) {
					for(int c =0; c<N; c++) {
						calc(r, c, 0, 4);
						calc(r, c, 4, 8);
					
					}
				}
				
				System.out.println("#"+ test_case +" "+ans);
			}
	}
	
	static void calc(int r, int c, int begin, int end) {
		int sum = map[r][c];
		
		for(int d= begin; d<end; d++) {
			for(int cnt=1; cnt<M; cnt++) {
				int nr = r + dr[d]*cnt;
				int nc = c + dc[d]*cnt;
				if( nr<0 || nr>=N || nc<0 || nc>=N ) break;
				sum += map[nr][nc];
			}
		}
		ans = Math.max(ans, sum);
	}
}
