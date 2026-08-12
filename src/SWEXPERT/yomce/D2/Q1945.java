package SWEXPERT.yomce.D2;

import java.util.Scanner;

public class Q1945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for(int i=1; i<=t; i++) {
			int n = sc.nextInt();
			
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			
			
			while(n%2 ==0) {
				n = n/2;
				a++;
				continue;
			}
			while(n%3 ==0) {
				n = n/3;
				b++;
				continue;
			}
			while(n%5 ==0) {
				n = n/5;
				c++;
				continue;
			}
			while(n%7 ==0) {
				n = n/7;
				d++;
				continue;
			}
			while(n%11 ==0) {
				n = n/11;
				e++;
				continue;
			}
			
			System.out.println("#" + i + " " + a + " " + b + " " + c + " " + d + " " + e );
			
			
			
		}
	}
}
