package javaAlgorythmStudy;
//평균값 구하기
import java.util.Scanner;
import java.io.FileInputStream;

import java.util.Arrays;

public class Swea2071 {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
		
		//10개의 수를 입력받으려면 어떻게 해야되지...???
			int[] arr = new arr[10];
			arr = sc.nextInt();
			//배열 선언하는게 아닌가..?ㅠㅠ왜안되지
			int sum = 0;
			double avr = 0;
		//합계랑 평균값 넣을 변수 미리 만들엇음..
		//크기가10인 배열을 만들어서 arr에 숫자들을 입력하게 하고싶은데 ㅠㅠ
			
			//배열을 싹 돌아서 걔네의 합을 구한다음 arr.length으로 나눌거야
			//근데 소수점 나오니까 double로 형변환해야함..어캐
			for (int i =0; i< arr.length; i++) {
				sum += arr[i] ; 
			}
			
			//다더했으니까 형변환 하고 나누자 
			avr = (double)sum / arr.length;
			
			//출력하자,.,
			System.out.printf("#"+T+ " " + avr);
			System.out.println();
			
			
		}
	}
}
