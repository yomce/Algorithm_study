package SWEXPERT.jejeon322_star.D1;


//자릿수 더하기
import java.util.Scanner;

public class Q2058 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		/// N에 받은숫자를 배열에 저장하고싶음
		/// 배열의 최대 크기가 4이긴함
		/// N = 1a + 10b+ 100c+1000d 를 이용하는건 아니겠지??
		/// 
		
		if(N < 10) {
			System.out.println(N);
		}else if(N < 100) {
			int a = N / 10;
		//	System.out.println(a);
			int b = N - 10 * a;
		//	System.out.println(b);
			
			System.out.println(a + b);
		} else if (N < 1000) {
			int c = N / 100;
			int d = (N - 100 * c)/10;
			int e = N - 100 * c - 10 * d;
			
			System.out.println(c + d + e);
		}else if (N <= 9999) {
			int f = N / 1000;
			int g = (N - 1000 * f) / 100;
			int h = (N - 1000 * f - 100 * g) / 10;
			int i = (N - 1000 * f - 100 * g - 10 * h);
			System.out.println(f + g + h + i);
		}
			
		
		
		
		
	}
}