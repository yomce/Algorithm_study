package SWEXPERT.yomce.D2;

import java.util.Scanner;

public class Q1284 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int cost;
			int A;
			int B;
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			
			if (W<=R) {
				B = Q;
			}else {
				B = Q+(W-R)*S;
			}
			
			A = P*W;
			
			if(A<=B) {
				cost = A;
			} else {
				cost = B;
			}
			
			System.out.println("#"+test_case+" "+cost);
		}
	}
}
