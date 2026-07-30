package javaAlgorythmStudy;
//홀수만 더하기
import java.util.Scanner;
import java.util.Arrays; //내가임의로추가햇음..//추가하면안되나??

public class Swea2072{


public static void main(String args[]) throws Exception {

Scanner sc = new Scanner(
		"""
		3
		3 17 1 39 8 41 2 32 99 2
		22 8 5 123 7 2 63 7 3 46
		6 63 2 3 58 76 21 33 8 1   
		"""
		);

int T; 
int sum = 0;
T=sc.nextInt();//테스트케이스의 개수 3이 들어감

for(int test_case = 1; test_case <= T; test_case++) {
//이거는 test_case가 3개면 그거 3개를 돌겠다는뜻
//10개의숫자를 받아야되니까 그것도 구현해야되는데 어쩌지
	int[] arr = new int[10] ;

	for(int i = 0; i< arr.length ; i++) {
		arr[i] = sc.nextInt();
		//홀수인 경우를 찾는다
		if (arr[i] % 2 == 1) { 
		//만약 2로나눈 나머지가 1이면 홀수이므로 if가 true라면 다 더한다
		//다 더하기 위해 변수를 하나만들어야될듯..?? 
		//sum에 앞으로 if를 통과한 애들을 다 더해서 걔를 다시 sum으로 정의하자
		sum += arr[i];
		//10개를 반복하면 다 더한 값인 sum이 나오겠지??
				}
		//출력할거니까 
			}
		System.out.println("#" + T + " " + sum);//이렇게 지저분한거맞나..
		}	
			
	}
}