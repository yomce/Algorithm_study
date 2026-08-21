package SWEXPERT.jejeon322_star.D2;
//중간 평균값 구하기

import java.util.Scanner;
import java.util.Arrays;
public class Q1984 {
	public static void main(String[] args) {
		
		
		///10개의 수를 입력 받아, 최대 수와 최소 수를 제외한 
		/// 나머지의 평균값을 출력하는 프로그램을 작성하라.
		/// Array.sort(arr) 하고
		/// for(int i =1; i<arr.length -1 ; i++) {
		/// sum += arr[i];
		/// } 
		/// 하면될듯..
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int test_case = 1; test_case<=t ; test_case++) {
			
			int[] arr = new int[10];
			for (int i = 0 ; i < 10 ; i++) {
				arr[i] = sc.nextInt();
			} //숫자10개넣기
			
			Arrays.sort(arr);
			double sum =0;
			double Davr = 0;
			int avr = 0;
			
			for(int i =1; i<arr.length -1 ; i++) {
				sum += arr[i];
				Davr = Math.round(sum / 8); 
				avr = (int)Davr;
			}//정렬하고 평균구함
			
			
			System.out.println("#"+test_case+" "+avr);
		}
		
	}

}
