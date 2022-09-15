package chapter09.EX04;

public class Test_A {

	public static void main(String[] args) {
		
		//객체 생성후 출력 (인스턴스 필드, 정적필드)
		System.out.println(A.n);
		
		A a = new A();
		System.out.println(a.m);		//인스턴스 필드 출력 : 객체 생성 후 출력
		System.out.println(a.n);		//정적 필드 출력 : 객체 생성 후 ,객체 없이도 출력
		
		//객체 생성 없이 출력 (클래스 이름.n)
		
		System.out.println(A.n);
//		System.out.println(A.m);	//인스턴스 필드 : 반드시 객체 생성후
		
		//정적 필드는 모든 객체에서 공유하는 필드
		A a1 = new A();
			 a1.m = 10;		//m : 3 == > 10 	: 인스턴스 필드 : 그 객체에서만 저장됨
			 a1.n = 100;	//n : 5 == > 100	: 정적 필드 : 모든 객체에서 공유되는 필드
			 
		A a2 = new A();
			 a2.m = 15;		//m : 3 ==> 15
			 a2.n = 1000;	//n : 5 ==> 1000
			 
		A a3 = new A();
			 a3.m = 20;
			 a3.n= 5000;
		
		//객체 정보 출력
		a1.print();
		a2.print();
		a3.print();
		
		
	}

}
