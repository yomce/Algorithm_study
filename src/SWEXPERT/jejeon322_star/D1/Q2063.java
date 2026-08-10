package SWEXPERT.jejeon322_star.D1;
//중간값 찾기
import java.util.Arrays;
import java.util.Scanner;

class Q2063{


	
		    public static void main(String args[]) 
		    {
		       
		         
		            Scanner sc = new Scanner(System.in);
		 
		         
		            ///문제읽기
		            /// N 입력받고 배열크기N인 배열입력받고
		            /// 크기순서로 다시 재배열하고
		            /// 항상 배열의크기가 홀수니까 N/2+1번째 거 가져오면될듯??????
		            /// 
		            ///구현
		            /// 0. 변수선언하고배열입력받게 N이랑 arr선언
		            /// 1. N입력받고 for문으로 arr배열입력받기
		            /// 
		            /// 2. arr를 크기순으로 받기위해 새로 선언
		            /// int min=0;선언
		            /// >>>>for문 돌려서 배열이 min보다 작으면 arr[j]=arr[i]를 넣자
		            /// min을 충분히 큰수로 해야되는데 배열값중에 제일 큰걸 대입할수있나?
		            /// 
		            /// 3. 그리고 거기에서 N/2+1번째 배열을 출력
		             
		            int N = sc.nextInt();    //배열의 크기를 입력받음
		                         
		            int[] arr1 = new int[N];   //입력한 크기만큼의 배열이 생성됨
		                     
		            for (int i = 0; i<N; i++) {
		                arr1[i] = sc.nextInt();   
		                //입력받은 배열의 크기만큼 for문 돌면서 배열 원소를 입력받음(0부터N미만이면 N개입력되는거맞지않나??)
		            }
		             
		             
		            //이제 배열원소를 크기순으로 정렬할거임 (sort 메서드사용??)
		            Arrays.sort(arr1);
		             
		     
		             
		             
		            int ans = N/2; // 0열부터 시작이라서 그냥 N/2해도 중앙값이될듯
		            System.out.println(arr1[ans]);
		             
		        
		    
		
			
	}
}
