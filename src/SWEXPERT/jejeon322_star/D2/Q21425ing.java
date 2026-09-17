package SWEXPERT.jejeon322_star.D2;

//+= ing
import java.util.Scanner;

public class Q21425ing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int test_case = 1; test_case <= t; test_case++) {

			/// x += y” 또는 “y += x” 연산을 원하는 순서대로 원하는 만큼 수행하여, 
			/// x나 y 둘 중 하나 이상에 저장된 값이 N 초과가
			/// 되게 하려고 한다. 연산을 합쳐서 최소 몇 번 수행해야 하는지 계산
			/// 

			int x = sc.nextInt();
			int y = sc.nextInt();
			int N = sc.nextInt();
			
			int ans = 0;
			int cnt= 0 ;

			
			while(true) {
				if(x<y) {
					x+=y;
					cnt++;
				} else {
					y+=x;
					cnt++;
				}
				if(x>N || y>N) break;
				
			}
			
			///10 7 1293
			/// 0. 10 7 - > 1. 10 17 -> 2. 27 17 -> 3. 27 44 -> 4. 
			/// 
			
			
			System.out.println(cnt);

		}

	}
}