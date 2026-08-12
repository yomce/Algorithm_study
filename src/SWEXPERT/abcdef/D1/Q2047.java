package SWEXPERT.abcdef.D1;

import java.util.Scanner;

class Q2047
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String T; 
		T = sc.next();
		String result ="";
		for (int i = 0; i < T.length(); i ++) {
			char a = T.charAt(i);
			if (a >= 97) {
				a -= 32;
			} 
			
			result +=a;
		}
		System.out.println(result);

	}
}