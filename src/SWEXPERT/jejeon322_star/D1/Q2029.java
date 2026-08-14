package SWEXPERT.jejeon322_star.D1;
//
import java.util.Scanner;
public class Q2029 {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner("""
				3   
				9 2  
				15 6 
				369 15 
				""");
		int T = sc.nextInt();
		for (int test_case = 1; test_case<=T; test_case++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int q1 = a/b;
			int q2 = a%b;
			
			System.out.println("#"+test_case +" "+q1+" "+ q2);
		}
			
	
	}
}
