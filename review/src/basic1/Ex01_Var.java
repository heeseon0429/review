package basic1;
/*
 * 자료형(data type)
 * 1. 기본형
 * 		boolean
 * 		char
 * 		int/long		
 * 		double
 * 
 * 2. 참조형
 * 		클래스
 * 		배열
 * 		-> new 예약어를 통해 객체를 생성
 * (*) String
 */
import java.lang.*;

public class Ex01_Var {	//extends object{
	//* 멤버변수
	public static void main(String[] args) {
		// * 지역변수
		
		//문자열 변수 a 선언
		String a;
		//정수 변수 b 선언
		int b;
		
		//변수 b에 200 대입
		//변수 a에 "Hello"을 지정
		
		//변수 a와 b 콘솔에 출력
		a = "Hello";		// a = new String("Hello");			//
		b = 200;
		
		System.out.println(a);
		System.out.println(b);
	}

}
