package D2;

import java.util.Scanner;

public class Q1926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(
				"""
				369
				"""
				);
		
		int num = sc.nextInt();

//		for(int i=1; i<=num; i++) {
//			boolean isIn3 = false;
//			int n = i;
//			while(n!=0) {
//				if((n%10)!=0 && (n%10)%3==0) {
//					System.out.print('-');
//					isIn3 = true;
//				}
//				n /= 10;
//			}
//			if(!isIn3){
//				System.out.print(i);				
//			}
//			System.out.print(' ');
//		}
		
		
		for(int i=1; i<=num; i++) {
			if(rDigit369(i) > 0) {
				rPrint(rDigit369(i));			
			}else {
				System.out.print(i);
			}
			System.out.print(' ');
		}
	}
	
	public static int rDigit369(int num) {
		if(num==0) {
			return 0;
		}else {
			if( ((num%10)%3==0) && (num%10!=0)) {
				return rDigit369(num/=10)+1;
			}else {
				return rDigit369(num/=10);
			}
		}
	}
	
	public static int rPrint(int num) {
		if(num == 0) {
			return 0;
		}else {
			System.out.print('-');
			return rPrint(num-1);
		}
	}
}
