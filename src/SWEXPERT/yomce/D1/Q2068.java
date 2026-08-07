package SWEXPERT.yomce.D1;

import java.util.Scanner;

public class Q2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[10];
		for (int i = 0; i < n; i++) {
			int max = 0;
			for(int j = 0; j < arr.length ; j++) {
				arr[j] = sc.nextInt(); // 각 수는 0 이상 10000 이하의 정수
				if(arr[j] >= max) {
					max = arr[j];
					
				}
				
			}
			System.out.println("#" + (i+1) + " " +max);
		}
		
	}
}
