package SWEXPERT.jejeon322_star.D1;

import java.util.Scanner;
//가위바위보
public class Q1936 {
	
	static void A() {
		System.out.println("A");
	}
	static void B() {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
	
		/// 가위1 바위2 보 3
		/// 입력   출력
		/// 1 3   A 
		/// 2 1	  A
		/// 3 2   A 
		/// 
		/// 1 2   B 
		/// 2 3   B
		/// 3 1   B
		/// 
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a == 1 || b == 3) {
			A();
		} else if (a == 1 || b == 3) {
			A();
		}else if (a == 3 || b == 2) {
			A();
		}else if (a == 1 || b == 2) {
			B();
		}else if (a == 2 || b == 3) {
			B();
		}else if (a == 3 || b == 1) {
			B();
		}
		
		
		
		
	}

}
