package chapter09.EX05;

class B{
	
	int a = 10;			//인스턴스 필드
	static int b = 20;	//정적 필드
	
	void abc() {		//인트선트 메소드 : 객체를 생성 후 사용.
						//		-- 인스턴스 필드, 정적 필드, 인스턴스 메소드, 정적 메소드
		System.out.println(a);		//인스턴스 필드
		System.out.println(b);		//정적 필드
		cde();	//인스턴스 메소드
		bcd();	//정적 메소드
	}
	static void bcd() {		//정적 메소드
		System.out.println("정적 메소드 - bcd()");
//		System.out.println(a); //정적 메소드에 인스턴스 필드는 올 수 없다.
		System.out.println(b);	//정적 메소드에 정적 필드는 가능
//		cde();	//정적 메소드에 인스턴스 메소드는 올 수 없다.
		def();	//정적 메소드에 정적 메소드는 가능
	}
	void cde() {			//인스턴스 메소드
		System.out.println("인스턴스 메소드 - cde()");
	}
	static void def() {
		System.out.println("정적 메소드 - def()");
	}
}

public class Using_StaticMethod02 {

	public static void main(String[] args) {
		// 
		B.bcd();

		System.out.println();
		System.out.println(B.b);
		
		B abc = new B();
		System.out.println("=================abc()=====================");
		abc.abc();
	}

}
