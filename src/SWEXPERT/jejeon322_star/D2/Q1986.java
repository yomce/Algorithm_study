package SWEXPERT.jejeon322_star.D2;
//지그재그숫자
import java.util.Scanner;

public class Q1986 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int test_case =1 ; test_case <= t ; test_case++) {
			
			///1부터 N까지의 숫자에서 홀수는 더하고 짝수는 뺐을 때 최종 누적된 값을 구해보자.
			int num = sc.nextInt();
			int sum =0;
			for(int i = 1 ; i<=num; i++) {
				if(i % 2 == 0) {
					sum = sum - i;
				} else {
					sum = sum + i;
				}
				
			}
			
			
			
			
			System.out.println("#"+test_case + " " + sum);
		}
		
		
		
	}
}
