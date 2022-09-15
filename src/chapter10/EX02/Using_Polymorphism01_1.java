package chapter10.EX02;

class Aa{
	int a = 10;
}
class Bb extends Aa{
	int b = 20;
}
class Cc extends Bb{
	int c = 30;
}
class Dd extends Bb{
	int d = 40;
}

public class Using_Polymorphism01_1 {

	public static void main(String[] args) {
		// 다형적 표현
		Aa a = new Aa();
		System.out.println(a.a);

		Bb b = new Bb();
		System.out.println(a.a);
		System.out.println(b.b);
		
		//자식 객체를 생성시 부모 타입으로 지정하면 부모의 필드와 메소드만 접근가능
		// = 좌와 우는 타입이 같아야 한다.
		//		업캐스팅 : 자식 타입을 부모 타입으로 변환(자동으로 컴파일러가 넣어줌)
		Aa a1 = (Aa)new Bb();
		System.out.println(a1.a);

		//다운캐스팅 : 부모 타입을 자식 타입으로 변환 ( 수동으로 명시 )
		System.out.println("==Aa 타입의 객체 a1dmf Bb타입으로 다운캐스팅==");
		Bb b1 = (Bb) a1;
		System.out.println(b1.a);
		System.out.println(b1.b);
		
		//업캐스팅 : 자동으로 적용됨 , 명시하지 않더라도 컴파일러가 자동으로 등록
		System.out.println("==업캐스팅==");
		Aa a2 = b1;			//Aa a2 = (Aa)b1;
		System.out.println(a2.a);
		
		//다운캐스팅
		System.out.println("==다운캐스팅==");
		Bb b2 = (Bb) a2;
		System.out.println(b2.a);
		System.out.println(b2.b);
		
		System.out.println("===================");
		
		//Dd() 객체를 생성하면서 Aa 타입으로 다운캐스팅
		Aa a3 = new Dd();
		System.out.println(a3.a);
		
		//Aa 타입의 a3 를 Bb 타입으로 다운캐스팅
		System.out.println("====다운캐스팅====");
		Bb b10 = (Bb)a3;
		System.out.println(b10.a);
		System.out.println(b10.b);
		
		System.out.println("=======");
		Dd d = new Dd();
		System.out.println(d.d);
		
		System.out.println("=====");
		Dd d1 = (Dd)a3;
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.d);
		
		System.out.println("=====");
		Dd d2 = d;
		System.out.println(d2.d);
		System.out.println(d2.a);
		
		
		
		
		
		
	}

}
