package SWEXPERT.jejeon322_star.D2;
//+= ing
import java.util.Scanner;
public class Q21425ing {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int test_case =1 ; test_case <= t ; test_case++) {
			
			
			/// 각 줄에는 세 개의 정수 A B N이 공백 하나씩을 사이로 두고 주어진다.
			/// x나 y 둘 중 하나 이상에 저장된 값이 N 초과가 되게 하기 위해 
			/// “x += y”, “y += x” 연산을 최소 몇 번 수행해야 하는지 출력한다.
			/// if(x + y > N ) { break }
			/// for 돌려서 i출력?
			/// 
			/// 1 2 2 -> 1/ 1 2 3 -> 2 / 1 2 4 ->2 / 1 2 5 ->3 / 
			/// 10 7 1293 ->11
			/// x += y = 17      17 7
			/// 
			/// x += y = 24      24 7
			/// y += x = 24		 17 24
			/// 
			/// if(x>y) {y += x ;} else if(y>x) {x += y;}
			/// 
			/// sum = x+y; 
			/// if(x>y) {y = sum;} else if(y>x) {x = sum;}
			/// 
			
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int N = sc.nextInt();
			
			int sum = 0;
			int ans = 0;
			
			
			for(int i = 0; i< 1000; i++) {
				
					
				if(x>y) {
					y += x ;
					sum = x + y;
					break;
				} else if(y>=x) {
					x += y;
					sum = x + y;
					break;
				} 
				
				
				
				if(x>y) {
					y = sum;
				} else if(y>=x) {
					x = sum;
				} 

				if(x + y > N ) { 
				ans = i;
				break; 
				}
			}
			
			System.out.print(x + " ");
			System.out.print(y + " ");
			System.out.print(sum);
			System.out.println();
			System.out.println(ans);
		}	
		
		
			
	}	
}