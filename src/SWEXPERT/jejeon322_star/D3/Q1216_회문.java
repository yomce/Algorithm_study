package SWEXPERT.jejeon322_star.D3;

import java.util.*;

public class Q1216_회문 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for(int t = 0 ; t < 10 ; t++) {

			int tc = sc.nextInt();
			
			int[][] arr1 = new int[100][100];
			int[][] arr2 = new int[100][100];

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					int arr = sc.nextInt();

					arr1[i][j] = arr;
					arr2[j][i] = arr;
				}
			}

			boolean ok1 = false;
			boolean ok2 = false;

			int ans = 0;
			for (int length = 100; length >= 1; length--) {
				boolean find = false;

				for (int i = 0; i < 100; i++) { // 한 행에서
					for (int j = 0; j < 50; j++) { // 회문검사해야돼서 절반만 보기..?
						if (arr1[i][j] == arr1[i][100 - 1 - j]) {
							ok1 = true;
						} // if
						if (arr2[i][j] == arr2[i][100 - 1 - j]) {
							ok2 = true;
						} // if

						if (ok1 || ok2) {
							ans = length;
							find = true;
							break;
						}
					}
					if(find) break;
				}
				if(find) break;

			}
			System.out.println("#" + tc + " "+ans);

		}

	}

}
