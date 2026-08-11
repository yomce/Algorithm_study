package SWEXPERT.yomce.D1;

import java.util.Scanner;

public class Q2019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int mul = 1;
		System.out.print(mul);
		for (int i=1; i<=N; i++) {
			mul *= 2;
			System.out.print(" "+mul);
		}
	}
}
