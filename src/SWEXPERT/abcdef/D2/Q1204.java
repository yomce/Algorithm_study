package SWEXPERT.abcdef.D2;

import java.util.Scanner;

class Q1204
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int a = 0; a <10; a++) {
			int t = sc.nextInt();
			for (int b = 0; b < 1000; b++){
				int arr [] = new int [1000];
				int x = sc.nextInt();
				arr[b] = x;
				System.out.println(arr[b]);
			}
		}
				

	}
}