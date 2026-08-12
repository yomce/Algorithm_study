package SWEXPERT.abcdef.D1;

import java.util.Scanner;

class Qpractice
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		//키보드 입력을 읽는 Scanner 객체를 생성하고, sc에 변수로 사용
		int N = sc.nextInt();
		//입력에서 다음 정수 하나를 읽음
		System.out.println("입력: "+N);
		
		int [] nums = new int[N];
		
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if(nums[i]%2 == 0) {
				sum += nums[i];
			}
		}System.out.println(sum);

	}
}