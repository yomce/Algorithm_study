package SWEXPERT.abcdef.D1;

import java.util.Scanner;

class Q2029
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		int remain = 0;
		int quo = 0;
		for (int i=1; i <T+1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			remain = a/b;
			quo = a%b;
			
			System.out.println("#"+i+" "+remain+" "+quo);
		}
	}
}