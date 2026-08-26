package SWEXPERT.yomce.D2;

import java.util.Scanner;

public class Q21425 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++){
		
			int x = sc.nextInt();
			int y = sc.nextInt();
			int N = sc.nextInt();
			
			int A = 0;
			int count_A = 0;

			
			while(A<=N) {
				if(x<=y) {
					x += y;
					A = x;
					count_A++;
				} else {
					y += x;
					A = y;
					count_A++;
				}
			}
			
			System.out.println(count_A);

		}
	}
}
