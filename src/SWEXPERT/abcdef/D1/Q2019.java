package SWEXPERT.abcdef.D1;

import java.util.Scanner;

class Q2019
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		int sum = 1;
		for(int test_case = 0; test_case <= T; test_case++)
		{
			if (test_case ==0 ) {
				System.out.print(1+" ");
			}else {
				sum *= 2;
				System.out.print(sum+" ");
			}

		}
	}
}