package SWEXPERT.jejeon322_star.D1;
import java.util.Scanner;
//더블더블
public class Q2019 {
	public static void main(String[] args) {
		//1부터 주어진 횟수까지 2를 곱한 값(들)을 출력
		///
		/// 8 -> 1 2 4 8 16 32 64 128 256
		/// 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 1;
		System.out.print(ans + " ");
		for(int i = 1; i<=N ; i++) {
			
			ans = ans * 2;
			
			System.out.print(ans +" ");
		}
	
	
	}

}
