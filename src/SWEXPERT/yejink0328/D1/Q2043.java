package D1;

import java.util.Scanner;

public class Q2043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(
				"""
				100 123
				
				""");
		
		int P = sc.nextInt();
        int K = sc.nextInt();
        
		System.out.println(P-K == 0 ? 0 : 999*(Math.min(0, P-K)/(P-K)) + P-K+1);
	}
}
