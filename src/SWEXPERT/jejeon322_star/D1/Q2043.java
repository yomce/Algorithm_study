package SWEXPERT.jejeon322_star.D1;

//서랍의 비밀번호
import java.util.Scanner;

public class Q2043 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int K = sc.nextInt();
		
		
		
		//K가 더 작을때..
		/// k가 p랑 같아질때까지
		/// k에 1을 더하는 행위를 p-k+1번 반복할거니까  ans가 끝이고
		/// 
		///K가 더 클때..
		/// 999-k+1+p 를하면될듯
		/// for문으로는 어캐해..?
		/// 
		/// 
		if(P>K) {
			int ans = P-K+1;
			System.out.println(ans);
		} else {
			int ans = 999 - K + 1 + P;
			System.out.println(ans);
		}
		
	
		
	}//main

}
