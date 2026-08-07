package SWEXPERT.abcdef.D1;

import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Q2070 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		int[] arr = new int[2];

		for (int test_case = 1; test_case <= T; test_case++) {
			for(int i = 0; i <2; i++) {
				arr[i] = sc.nextInt();
			}
			
			
			if (arr[0] < arr[1]) {
				System.out.println("#" + test_case + " " + "<");
			}
			if (arr[0] == arr[1]) {
				System.out.println("#" + test_case + " " + "=");
			}
			if (arr[0] > arr[1]) {
				System.out.println("#" + test_case + " " + ">");
			}
		}
		
	}
}