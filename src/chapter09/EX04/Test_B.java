package chapter09.EX04;

class B{
	int m = 3;
	static int n = 5;
}

public class Test_B {

	public static void main(String[] args) {
		// 객체 생성
		B b1 = new B();
		B b2 = new B();

		//인스턴스 필드의 값 변경
		b1.m = 5;
		b2.m = 6;
		
		System.out.println(b1.m);
		System.out.println(b2.m);
		
		//정적 필드값 수정
		b1.n = 7;
		b2.n = 8;
		
		System.out.println(b1.n);
		System.out.println(b2.n);
		
		//정적 필드 수정 : 객체 없이 클래스 명으로 수정
		B.n = 9;
		
		System.out.println(b1.n);
		System.out.println(b2.n);
		
		
		
	}

}
