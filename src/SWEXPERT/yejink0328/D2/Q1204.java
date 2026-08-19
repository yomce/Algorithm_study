package D2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Q1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			
            Map<Integer, Integer> map = new HashMap<>();
			int numberT = sc.nextInt();
            
            for(int i = 0; i<1000; i++) {
            	int score = sc.nextInt();
                if(map.get(score)==null) {
                	map.put(score, 1);
                }else {
                	map.put(score, map.get(score)+1);
                }
            }
            
            int max = 0;
            int mod = 0;
            
            for(Integer k : map.keySet()) {
            	if(max <= map.get(k) && mod < k) {
                	max = map.get(k);
                    mod = k;
                }
            }
			System.out.println("#"+numberT+" "+mod);
		}
	}
}