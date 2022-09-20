package basic2;

import java.util.Scanner;

/*
 * for		: 반복횟수가 정해진 경우 
 * while	: 횟수를 모르는 경우
 * do~while	: 횟수를 모르는 경우 ( 조건을 나중에 비교 )
 */


public class Ex02_반복문구분 {

	public static void main(String[] args) {
		
		// 구구단의 단수를 입력받아서 해당 단의 구구단을 출력
		Scanner input = new Scanner(System.in);
		System.out.println("구구단의 단수를 입력하세요");
		int i = input.nextInt();
		System.out.println("해당 단의 구구단을 출력합니다.");
		
		//1. for문
		System.out.println("===for문===");
		for(int j = 1; j < 10; j++ ) {
				System.out.println(i + "*" + j + "=" + i * j);
		}
	
		//2. while
		System.out.println("====구구단 중 원하는 단수를 입력하세요");
		int j = 1;
		while( j < 10 ) {
			System.out.println(i + "*" + j + "=" + i * j);
			 j++;
		}
	
		
		//2. while 응용
		System.out.println("====while문 응용");
		while(true) {
			System.out.println("구구단 중 원하는 단수 입력하세요");
		
			
		}
		//3. 
		//3. do~while 응용

			
		}
	}


