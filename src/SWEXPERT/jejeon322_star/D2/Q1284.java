package SWEXPERT.jejeon322_star.D2;
//수도 요금 경쟁
import java.util.Scanner;

public class Q1284 {
	public static void main(String[] args) {
		
		/// A사:k패스
		/// B사:기후동행
		/// 
		/// A사:W*P
		/// B사: 
		/// if(W<=R) {
		/// Q;
		/// } else {
		/// Q + S*(W-R);
		/// }
		/// 
		/// 
		/// 
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <=T; test_case++) {
		
			
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int W = sc.nextInt();
		
		int Apay = W*P;
		int Bpay = 0;
		
		if(W<=R) {
		Bpay = Q;
		 } else {
		Bpay =  Q + S*(W-R);
		 }
		
//		System.out.println(Apay+" "+ Bpay);
		
		int realPay = 0;
		if (Apay > Bpay) {
			realPay = Bpay;
		}else {realPay = Apay;}
		
		System.out.println("#" + test_case + " " + realPay);
		
		}
	}

}
