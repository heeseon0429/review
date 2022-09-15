package chapter09.EX05;

//메서드 이름 앞에 static이 없는 메서드 : 인스턴스 메서드 : 객체 생성후 호출
//메서드 이름 앞에 staitc이 있는 메서드 : 정적 메서드 : 객체 생성 후 호출, 객체 생성 없이도 호출


class A{
	
	void abc() {
		System.out.println("인스턴스 메서드");
	}
	static void bcd() {
		System.out.println("정적 메서드");
	}
	
}

public class Using_StaticMethod01 {

	public static void main(String[] args) {
		// 객체 생성 없이 바로 호출 : 정적 메소드( 클래스명.메소드명 )
		
		A.bcd();
		
	}

}
