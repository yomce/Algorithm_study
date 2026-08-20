package SWEXPERT.jejeon322_star.D2;

import java.util.Scanner;

//S/W 문제해결 기본] 1일차 - 최빈수 구하기
public class Q1204 {


public static void main(String[] args) {
	
	/// 점수를 100까지 저장하는배열만들고
	/// 사람 1000명을 어떡하라는거야..
	/// 
	
	Scanner sc = new Scanner(System.in);
	int T=sc.nextInt();
			
	for(int test_case = 1; test_case <= T; test_case++)
	{//테스트케이스의 수 만큼 for문을 반복
		int n = sc.nextInt(); //testcase번호
		int[] score = new int[101];//100점까지 넣어야되니까 101까지..배열인덱스를 점수로

	for(int s = 0; s<1000; s++) {//입력한 숫자 1000개 다 배열에 저장			
		score[sc.nextInt()]++; //개충격.. 배열의 인덱스를 입력할수있다니.. 그리고++로 배열 늘어날때마다1씩 더하기..충격
	}
	//그럼 배열인덱스를 0~100까지 돌려서 배열값이 제일큰거를 찾고 -> 그 인덱스를 환원하면될듯
	int max =0; //빈도
	int idx =0; //점수
	
	for(int i=0; i<101; i++ ) {
		if( score[i] >= max) {
			max = score[i];
			idx = i;			
		}
	}
	
		System.out.println("#"+test_case+" "+idx);
		
	}
	
}

}
