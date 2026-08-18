package SWEXPERT.abcdef.D1;

import java.util.Scanner;

class Q1545
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		int end = T;
		for(int i = 0; i<=T;i++) {
			System.out.print(end+" ");
			end -= 1;
		}

	}
}