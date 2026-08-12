package SWEXPERT.abcdef.D1;

import java.util.Scanner;

class Q2050
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String T;
		T=sc.next();
		
		for(int i = 0;i<T.length(); i++) {
			
			char a = T.charAt(i);
		
			System.out.print((int)a-64+ " ");
		}
		
		/*하나씩 알파벳 찍어보기
		System.out.println();
		char c ='A';
		System.out.println((int)c);
		char b ='B';
		System.out.println((int)b);
		char d ='a';
		System.out.println((int)d);
		*/		

	}
}