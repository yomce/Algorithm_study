package SWEXPERT.jejeon322_star.D1;
import java.util.Scanner;

public class Q1933 {
	public static void main(String[] args) {
		
		
		///약수 출력
		/// n을 주면 i=1부터 i=n까지 n/i를해
		/// n%i ==0일때만 i를 출력해
		/// 
		
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i<=N; i++) {
			if(N%i == 0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
