package Chapter07.EX05;

class Abc {
	
	// 기본 생성자: 입력매개변수가 없는 생성자
	Abc() {
		System.out.println("첫 번째 생성자 - 기본 생성자");
	}
	
	Abc(int a) {
		this();		// 기본 생성자를 호출, this() - 입력매개변수가 없는 생성자 호출
		System.out.println("두 번째 생성자 호출");
	}
	
	Abc(int a, String b) {
		this(30);	// 입력매개변수가 정수 1개인 생성자 호출
		System.out.println("세 번째 생성자 호출");
	}
	
	Abc(int a, String b, String c) {
		this(40, "오늘");
		System.out.println("네 번째 생성자 호출");
	}
}

public class ThisMethod01 {

	public static void main(String[] args) {
		// This Method: 자신이 속한 클래스 내부의 다른 생성자를 호출
		//		- 반드시 생성자 내부에서만 사용, 메서드 내부에서 사용 X
		//		- 반드시 생성자의 첫 라인에 위치해야 한다
		//		- 클래스명이 A라면 this()는 A() 생성자를 호출하는 것

		System.out.println("===기본 생성자 호출===");
		Abc abc1 = new Abc();		// 기본 생성자 호출
		
		System.out.println("===입력매개변수가 정수 1개인 생성자 호출===");
		Abc abc2 = new Abc(50);
		
		System.out.println("===입력매개변수가 정수 1개, 문자열 1개인 생성자 호출===");
		Abc abc3 = new Abc(40, "오늘");
		
		System.out.println("===입력매개변수가 정수 1개, 문자열 2개인 생성자 호출===");
		Abc abc4 = new Abc(50, "오늘", "집");
		
	}

}
