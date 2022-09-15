package chapter09.EX05;

//static 필드의 값 초기화 : 클래스 내부에서 static {필드의 값을 초기화}

class C{
	int a;
	static int b;
	
	static {		//클래스가 클래스영역에 로드될때 제일 먼저 작동. 생성자와 같은 역할
//		a = 10;	//인트턴스 필드는 초기화 할 수 없다.
		b = 10;
		System.out.println("클래스 C가 로딩 되었습니다.");
	}
	C (){		//생성자 : 객체를 생성시 필드의 초기값을 할당.
		a = 3;
		b = 55;
		
	}
}

public class Using_StaticMethod03 {

	int a;
	static int b = 10;
	
	void abc() {
		System.out.println("집 가기 5분 전");
		
	}
	static void bcd() {
		System.out.println("집 가기 3분 전");
	}
	
	
	public static void main(String[] args) {
		// 객체 생성 없이 static필드 호출
		System.out.println(C.b);
		C c = new C();
		
		System.out.println(c.b);
		
		System.out.println(Using_StaticMethod03.b);
		Using_StaticMethod03 ak = new Using_StaticMethod03();
		ak.abc();

		Using_StaticMethod03.bcd();
	}

}
