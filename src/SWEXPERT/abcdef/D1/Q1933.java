package SWEXPERT.abcdef.D1;

import java.util.Scanner;

class Q1933
{
	public static void main(String args[]) throws Exception
	{
		//약수 = 나눴을때 나머지가 0이 아닌
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for (int i = 1; i<=T; i++) {
			if(T%i == 0) {
				System.out.print(i+" ");
			}
		}
		
	}
}