package SWEXPERT.jejeon322_star.D1;
//연월일 달력 

import java.util.Scanner;
import java.util.Arrays;

/*5
22220228
20150002
01010101
20140230
11111111
*/

public class Q2056 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (
				"""
				5
				22220228
				20150002
				01010101
				20140230
				11111111
				""");
		int t = sc.nextInt();
		for(int i = 1; i<=t; i++) {
		
			String year1;
			String month1;
			String day1;
	
			
			
			String cal = sc.next();
			Integer.parseInt(cal);
			
			year1 = cal.substring(0,4);
			month1 = cal.substring(4,6);
			day1 = cal.substring(6,8);
			
			int year = Integer.parseInt(year1);
			int month = Integer.parseInt(month1);
			int day = Integer.parseInt(day1);
			
			if(month >= 1 && month <=12) {
			
			if(month == 1 || month == 3 || month == 5 ||month == 7 || month == 8 || month == 10 || month == 12) {
				if(day <= 31) {
					System.out.printf("#%d %04d/%02d/%02d%n",i, year, month, day);
				}else System.out.println("#" + i + " " + -1); 
			}
			
			if(month == 2) {
				if(day <= 28) {
					System.out.printf("#%d %04d/%02d/%02d%n",i, year, month, day);
				}else System.out.println("#" + i + " " + -1);
			}
			if(month == 4 || month == 6 || month == 9 || month == 11 ) {
				if(day <= 30) {
					System.out.printf("#%d %04d/%02d/%02d%n",i, year, month, day);
				}else System.out.println("#" + i + " " + -1);
			}
		}else {
			System.out.println("#" + i + " " + -1);
			}
		/// int 변수를 [0:5],[5:7],[7:]으로 잘라서 
		/// 각각을 int year, int month, int day로 저장함
		
		// 연월일조건에 안맞으면 -1 출력
		
		// int로 바꾼건데 왜안됨??
		 
//		if(month <= 0 || month >12)
//			
//		 { if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
//		 if(day != 31) {
//		 		System.out.print(-1);
//		 		
//		 	} 
//		 }
//		 else if  (month == 4 || month == 6 || month == 9 || month == 11) {
//	 		if(day != 30) {
//	 		System.out.print(-1);
//		 		} 
//		 	}
//		 else if (month== 2) {
//		 		if (day != 28) {
//		 		System.out.print(-1);
//				}
//			}
//		 
//		 } System.out.print(-1);
		  
		
		 
		//그리고 각각을 
//		 System.out.printf("#%d %d/%d/%d", i, year, month, day);
	  		
		
		}	
	
	}
		
}
	