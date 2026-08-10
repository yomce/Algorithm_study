package SWEXPERT.yomce.D1;

import java.util.Scanner;


public class Q2056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] arr = new String[10];
		for (int i=1; i<=T; i++) {
			String date = sc.next();
			for (int j=0; j<10; j++) {
				if( j == 4 || j == 7 ) {
					arr[j] = "/";
				} else if (j == 5 || j == 6) {
					arr[j] = String.valueOf(date.charAt(j-1));
				} else if (j == 8 || j == 9) {
					arr[j] = String.valueOf(date.charAt(j-2));
				} else {
					arr[j] = String.valueOf(date.charAt(j));
				}
			}
//			System.out.println(Arrays.toString(arr));
			String result = new String();
			int month = Integer.parseInt(date.substring(4, 6));
			int day = Integer.parseInt(date.substring(6, 8));
			
			if (month <= 0 || month >= 13) {
				result = "-1";
			} else if ((month ==2 && day >=29) || 
						day <=0) {
				result = "-1";
			
			} else if ((month == 1 || 
						month == 3 || 
						month == 5 || 
						month == 7 || 
						month == 8 || 
						month == 10 || 
						month == 12) 
						&& 
						(day >= 32 || 
						 day <=0)) {
				result = "-1";
	
			} else if((month == 4 || 
					   month == 6 || 
					   month == 9 || 
					   month == 11) 
					   && 
					   (day >=31 || 
					    day <=0) ) {
				result = "-1";
				
			} else {
				for(int t=0; t<10; t++) {
				result += arr[t];
			}
				
//				System.out.println(arr[t]);
			}
//			System.out.println(result);
			System.out.println("#"+i+" "+result);
		}
	}
}
