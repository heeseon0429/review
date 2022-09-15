package chapter09.EX02;

import chapter09.EX01.A;

//class D는 A를 상속 받는다.
	//D class는 A class의 필드와 메소드를 상속 받는다.

public class D extends A{
		
	public void print() {
		System.out.println("==부모 클래스의 필드 출력 (다른패키지) ==");
		System.out.println(a);	//public : 다른 패키지에서 접근됨
		System.out.println(b);	//protected : 다른 패키지에서 접근됨 (상속시에만)
//		System.out.println(c);	//default
//		System.out.println(d);	//private
		
		//메소드 접근
		System.out.println("==부모 클래스의 메소드 출력==");
		print1();	//public
		print2();	//protected
//		print3();	//default
//		print4();	//private
	
	}
	
}
