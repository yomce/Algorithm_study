package SWEXPERT.abcdef.D2;

import java.util.Scanner;

class Q1284
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int i = 1; i <= T; i++)
		{
			/*
			 * P : 리터당 A사 요금
			 * Q : B사 기본 요금
			 * R : 월간 사용량 R리터 이하인 경우 기본 요금 청구
			 * S : R보다 초과한 경우 리터당 요금
			 * W : 수도양
			*/
			
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			
//			if(P*W < Q) {
//				System.out.println("#"+i+" "+P*W);
//			}
//			
//			if(W>R){
//				System.out.println("#"+i+" "+((W-R)*S+Q));
//			}
//			
//			if(W<=R){
//				System.out.println("#"+i+" "+Q);
//			}
			
            int A = P * W;
            int B;

            if (W <= R) {
                B = Q;
            } else {
                B = Q + (W - R) * S;
            }

            if (A < B) {
                System.out.println("#" + i + " " + A);
            } else {
                System.out.println("#" + i + " " + B);
            }
		}
	}
}