package SWEXPERT.jejeon322_star.D1;
// 최대값 구하기 해결
import java.util.Scanner;

public class Q2068 {
	public static void main(String args[]) throws Exception{

		 Scanner sc = new Scanner(System.in);
	        int T;
	        T=sc.nextInt();
	        
	        for(int test_case = 1; test_case <= T; test_case++)
	        {
	            int ans = 0 ;
	    int[] arr = new int[10];
	     
	    for(int j = 0; j<10; j++) {
	    arr[j] = sc.nextInt();
	    if (ans <= arr[j]) {
	        ans = arr[j];
	        }
	    }
	 
	    System.out.println("#"+test_case + " " + ans);
	        }
		
		
		
	}
}