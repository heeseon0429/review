package chapter09.EX02;

import chapter09.EX01.A;
//A클래스와 다른 패키지에 존재하는 클래스 : import를 사용

public class Using_Modifier02 {

	public static void main(String[] args) {
		// import 됨
		A a = new A();
		
		//필드 접근
		System.out.println(a.a);		//public
//		System.out.println(a.b);		//protected
//		System.out.println(a.c);		//default
//		System.out.println(a.d);		//private

		
		//메소드 접근
		a.print1();		//public
//		a.print2();		//protected
//		a.print3();		//default
//		a.print4();		//private
		
		System.out.println("==상속 관계 객체 출력(D) ==");
		D d = new D();
		d.print();
	}

}
