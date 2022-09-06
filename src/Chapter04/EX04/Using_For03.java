package Chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		// for 문 내의 if
		// 정수 (음수, 양수)을 스캐너로 5개 인풋 받아서
		// 양수만 더한 값과 평균갑을 출력 하세요.
		
		Scanner sc = new Scanner (System.in);
		
		int a;
		int i;
		int sum = 0;
		
		for(i = 0; i < 5; i++) {
			a = sc.nextInt();
			if (a > 0) {
				sum += a;
				
				System.out.println("양수를 더한 값 :" + sum);
			}
	}
		int sum2 =0; //양수만 더함
		int sum1 = 0;   //모든수를 더함
		int count = 0;   //양수를 카운드하는 변수
		int count1 =0;   //모든 수를 카운트함
		System.out.println("정수를 입력하세요(음수, 양수.  )");
		for(int j=0; j < 5; j++) {
			int n=sc.nextInt();
			sum1 += 0;  //입력받은 모둔 수를 더함
			//count 1++;  //모든 수를 카운드
			if (n > 0) {
				sum += n;
				count++;  //양수일때 1씩 증가
				
			}
		}
	System.out.println("양수의 합 : " + sum +", 양수의 평군 : " + sum / (double)count);
	System.out.println("모든 수의합:"+ sum1 + ", 모든수의평군 " + sum1 / (double)count1);
	
	}
}
