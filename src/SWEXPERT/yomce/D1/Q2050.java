package SWEXPERT.yomce.D1;

import java.util.Scanner;

public class Q2050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alphabet = new String();
		alphabet = sc.next();
		int len = alphabet.length();
		
		for (int i = 0; i < len; i++) {
			int alp = alphabet.charAt(i) - 'A' + 1;
			System.out.print(alp + " ");
		}
	}
}
