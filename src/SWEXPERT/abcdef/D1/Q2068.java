package SWEXPERT.abcdef.D1;

import java.util.Scanner;
import java.io.FileInputStream;

class Q2068
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[]arr = new int [10];

		for(int test_case = 1; test_case <= T; test_case++)
		{
			for(int i=0; i < 10; i++) {
				arr[i]=sc.nextInt();
				
			}java.util.Arrays.sort(arr);
			
			System.out.println("#"+test_case+" "+arr[9]);
			

			
			
		}
	}
}