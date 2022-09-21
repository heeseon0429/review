package basic1;

/*
 * 반복문 : for/ while / do~while
 * 
 * (1) for (초기치; 조건문; 증가치){
 * 			반복구문
 * 		}
 */

public class Ex03_for개념 {

	public static void main(String[] args) {

		// 1) 1부터 10까지 숫자 출력
		
		 for (int i=1; i <= 5; i++){
		  System.out.println(i);
			  		}
		 
		// [1] 위의 for 원리 이해하기
		// [2] 1부터 10까지의 합을 출력
		 System.out.println("==1부터 10까지의 합==");
		 int sum = 0;
		 for(int a = 1; a <=10; a++) {
			 sum += a;
		 }
			 System.out.println(sum);
		 
		// [3] 1부터 10까지의 홀수의 합을 출력
		System.out.println("==1부터 10까지의 홀수의 합==");
		int sum1 = 0;
		for(int b = 1; b <=10; b+=2) {
			sum1 += b;
		}
		System.out.println(sum1);
	
		
		// 2) 'A' 부터 'Z'까지 출력
		/*
		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.print(a);
		}
		System.out.println();
		
		
		for (char a = 'A'; a <= 'Z'; a+=2) {
			System.out.print(a);
		}
		System.out.println();
		
		//'Z'부터 'A'까지 출력
		for (char b = 'Z'; b >= 'A'; b--) {
			System.out.print(b);
		}
		*/
	
	}
}

