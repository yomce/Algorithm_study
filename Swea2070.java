package javaAlgorythmStudy;
import java.util.Scanner;
import java.io.FileInputStream;
public class Swea2070 {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();	
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			// 숫자 2개를 입력받는다고 해서 일단 넣음..
			
			System.out.printf("#" + T + " ");
			
			if(a>b) {
				System.out.println(">");
			}else if (a<b) {
				System.out.println("<");
			}else {System.out.println("=");
			}
			
			//근데 이문제가원하는거는 각 부등호도 변수로 출력하게 해서 마지막에 printf("#" + T + " "+ K)
			//인거같은데 모르겟다ㅠㅜㅠㅠㅠㅠㅠㅠ
				
			
			//틀렷음..ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
			
			
			
			
		}
				
	}

}
