package SWEXPERT.jejeon322_star.D1;
//알파벳을 숫자로 변환 실패

import java.util.Scanner;

import java.util.Arrays;

public class Q2050 {
	public static void main(String[] args) {
		
		// 값 입력 받는 부분
		Scanner sc = new Scanner (System.in);
		String inputStr = sc.next();
		
		// 받은 문자열 문자 단위로 배열로 만들기
		int size= inputStr.length(); 
		char[] inputArr = new char[size];
		inputArr = inputStr.toCharArray();
		
		//	arr[]랑 똑같은거 찾아오는 배열	
		char[] apb =  {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		for(int i = 0; i<size ; i++) {  //arr[]를 도는 for문
			for(int j = 0; j<26; j++) {	//apb[]를 도는 for문
				if(inputArr[i]==apb[j]) {	//문자열 비교
					System.out.print(j+1 + " ");	//apb 인덱스+1출력
					
				}
			}
		}
		


		
		
		
	}//main

}
