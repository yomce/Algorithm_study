package D2;

import java.util.Scanner;

public class Q1986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int ans = N%2 == 0 ? (N/2)*(-1) : (N/2)+1;
                        
            System.out.println("#"+test_case+" "+ans);
		}
	}
}
