package SWEXPERT.yomce.D2;

import java.util.Arrays;
import java.util.Scanner;

public class Q2001 {
	static int N, M;
    
    public static void main(String args[]) throws Exception
    {
         
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            M = sc.nextInt();
             
            int[][] map = new int[N][N];
 
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            int max = 0;
 
            for (int i = 0; i < N - M + 1; i++) {
                for (int j = 0; j < N - M + 1; j++) {
                    int sum = 0;
                     
                    for(int a=0; a<M; a++) {
                        for(int b=0; b<M; b++) {
                            sum += map[i+a][j+b];
                             
                             
                        }
                             
                    }
                    if (max <= sum) {
                        max = sum;
                    }
                }
            }
            System.out.println("#"+test_case+" "+max);
        }
    }
}