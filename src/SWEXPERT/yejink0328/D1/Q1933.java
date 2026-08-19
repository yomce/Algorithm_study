package D1;

import java.util.Scanner;

public class Q1933 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(
				"""
				9
				""");
		
		int N = sc.nextInt();
			
		int cnt = 0;
		for(int i=1; N>=i*i; i++) { // 시간복잡도 O(N^1/2)
			if(N%i == 0) {
				cnt+=2;
				if(i == N/i) {
					cnt--;
				}
			}
		}
		
		int[] numsArr = new int[cnt];
		
		int idx = 0;
		for(int i=1; N>=i*i; i++) {
			if(N%i == 0) {
				numsArr[idx++] = i;
				numsArr[cnt-idx] = N/i;
			}
		}
		
		for(int i : numsArr) {
			System.out.print(i+" ");
		}
	}
}
