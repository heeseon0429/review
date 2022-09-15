package chapter08.EX02;

//import 를 사용하지 않고 외부 패키지 접근 : 클래스의 전체 이름을 사용 ( 패키지명 + 클래스명 )
	// A 클래스 (public) (접근 O) , B 클래스 (default) (접근 X)

public class Using_Package03 {

	public static void main(String[] args) {
 
		//전체 이름 : 패키지명.클래스명 (public)
		chapter08.EX01.A a = new chapter08.EX01.A();
		
		System.out.println(a.m);	//외부 패키지에서 접근가능 (public)
		System.out.println(a.n);	//외부 패키지에서 접근가능 (public)
		a.print();					//외부 패키지에서 접근가능 (public)
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
