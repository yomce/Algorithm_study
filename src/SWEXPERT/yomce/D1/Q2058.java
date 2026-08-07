package SWEXPERT.yomce.D1;

import java.util.Scanner;


public class Q2058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // (1 ≤ N ≤ 9999)
		
		if (N>=1) {
			int thousands = (N/1000);
//			System.out.println(thousands);
			int M = N - thousands*1000;
			
			int hundreds = (M/100);
//			System.out.println(hundreds);
			int L = M - hundreds*100;
			
			int tenth = (L/10);
//			System.out.println(tenth);
			int P = L - tenth*10;
			
			int first = P;
//			System.out.println(first);
			
			System.out.println(thousands + hundreds + tenth + first);
			
		}
	}
}
