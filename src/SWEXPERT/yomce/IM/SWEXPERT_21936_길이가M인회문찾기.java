package SWEXPERT.yomce.IM;

import java.util.Scanner;

public class SWEXPERT_21936_길이가M인회문찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			String str = sc.next();
			
			String ans = "NONE";
			
			for(int i = 0; i <= N-M; i++) {
				
				// 길이가 M인 문자열 추출
				String sub = str.substring(i, i+M);
				
				// 문자열 뒤집기
				String reverse = new StringBuilder(sub).reverse().toString();
				
				// 문자열 비교
				if(sub.equals(reverse)) {
					ans = sub;
					break;
				}
				
			}
			
			System.out.println("#"+test_case+" "+ans);
			
			
		}
	}
}
