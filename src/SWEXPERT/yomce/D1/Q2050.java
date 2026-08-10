package SWEXPERT.yomce.D1;

import java.util.Scanner;

public class Q2050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alphabet = new String();
		alphabet = sc.next();
		int len = alphabet.length();
		
		for (int i = 0; i < len; i++) {
			String[] arr = new String[len];
			arr[i] = alphabet.charAt(i);
		}
		
		char a = 'A';


		int A  = (int) a - 64;

		
		System.out.println(alphabet);
		
	}
}
