package SWEXPERT.jejeon322_star.D2;

import java.util.Scanner;

//S/W 문제해결 기본] 1일차 - 최빈수 구하기
public class Q1204 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for(int test_case = 1; test_case<=T ; test_case++) {
			int Tnum = sc.nextInt();
			
			int[] arr = new int[101];
			
			for (int i = 0; i< 1000; i++) {
				arr[sc.nextInt()]++;
			}
			
			int max = 0;
			int score = 0;
			
			for(int j = 0; j< 101; j++) {
				if(arr[j] >= max ) {
					max = arr[j];
					score = j;
				}
			}
			
			System.out.println("#"+ test_case + " " + score);
		}
		
		
	
	}
}
