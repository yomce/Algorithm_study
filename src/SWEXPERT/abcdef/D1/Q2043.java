package SWEXPERT.abcdef.D1;

import java.util.Scanner;

class Q2043
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int [] nums = new int [2];
		int check = 0;
		for (int i = 0; i < 2; i++) {
			nums[i]=sc.nextInt();
		}
		check = nums[0] - nums[1]+1;
		System.out.println(check);
	}
}