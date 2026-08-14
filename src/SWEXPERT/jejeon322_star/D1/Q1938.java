package SWEXPERT.jejeon322_star.D1;
//계산기
import java.util.Scanner;
public class Q1938 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a+b;
		int min = a-b;
		int dou = a*b;
		int sla = a/b;
		
		System.out.println(sum);
		System.out.println(min);
		System.out.println(dou);
		System.out.println(sla);
		
	}

}
