package Chapter07.EX05;

class A {
	int m;
	int n;
	
	//A(){}			<= 기본 생성자, 생략되어 있다
	
	void init ( int a, int b ) {
		int c;
		c = 3;
		this.m = a;		// this: 자신이 포함된 클래스의 객체를 가리키는 참조 변수, 기본적으로 생략해서 사용해도 컴파일러가 자동으로 추가 
		this.n = b;		// 지역 변수는 멤버가 아니므로 this.가 자동으로 붙지 않는다
	}
	
	void work() {
		this.init(2, 3); 					//this. 생략 시 컴파일러가 자동으로 추가
		System.out.println(this.m + ", " + n);
	}
}

public class ThisKeyword01 {

	public static void main(String[] args) {
		/*
		 This keyword: 자신이 포함된 클래스의 객체를 가리키는 참조 변수명
			객체 자신을 뜻한다
			필드와 메서드를 선언 시에는 this 키워드를 사용하면 안 된다
			필드와 메서드가 클래스의 메서드 내에서 사용될 때 컴파일러가 자동으로 할당
			기본적으로는 생략되어 있다
			메서드나 생성자에서 인풋 매개변수 이름, 필드 이름이 동일할 경우 명시해야 한다
		*/
		
		/* This Method: 자신이 속한 클래스 내부의 다른 생성자를 호출하는 메서드
		 	클래스명이 A라면 this()는 A() 생성자를 호출하는 것
			1. 생성자의 내부에서만 사용할 수 있다
			2. 생성자의 첫 라인에 위치해야 한다
		*/
		
		// 클래스 객체 생성
		A a = new A();
		// 메서드 호출, 필드값 활용
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);
		
		
	}

}
