package SWEXPERT.abcdef.D1;

import java.util.Scanner;
import java.io.FileInputStream;

class Q2071
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		double res= 0;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			/////////////////////////////////////////////////////////////////////////////////////////////
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				int N = sc.nextInt();
				sum += N;
				res = (double)sum/10;

			}
			System.out.println("#"+test_case+" "+Math.round(res));

			/////////////////////////////////////////////////////////////////////////////////////////////

		}
	}
}