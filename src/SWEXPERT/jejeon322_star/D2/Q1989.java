package SWEXPERT.jejeon322_star.D2;
//회문

import java.util.Scanner;

public class Q1989 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int test_case =1 ; test_case <= t ; test_case++) {
			
			int ans =0;
			String st = sc.next();
			
//#1. for문 거꾸로 + charAt(i) 쓰기
			
			String reverseSt = "";
			for(int i = st.length() -1 ; i>=0 ; i--) {
				reverseSt = reverseSt + st.charAt(i);
			}

			
/*			
//#2. StringBuffer쓰기
/// 
			StringBuffer text = new StringBuffer(st);
			String reverse = text.reverse().toString();
*/			
			if(reverseSt.equals(st)) {
				ans = 1;
			}else { ans = 0; }
			
				
			
			
			
			System.out.println("#"+test_case + " " + ans);
		}
		
		
		
	}

}
///문자열을 뒤집은거랑 그냥 딱 문자가 똑같은지 보려면 equals() 를 쓰면되고
/// 아예 같은 객체를 가리키는지 보려면 == 비교한다
