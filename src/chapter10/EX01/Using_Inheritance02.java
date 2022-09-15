package chapter10.EX01;

class Fruit{		//과일 <== 부모클래스
	String name;	//과일 이름
	String color;	//과일 색
	int large;		//과일 크기
	
	void eat() {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
	void print() {
		System.out.println(name + ", " + color + ", 크기 : " + large);
	}
}

class Apple extends Fruit{		//사과 <== 자식클래스
	//자식 클래스만 가지는 필드 1, 메소드 1
	int appleNum;
	void apple() {
		System.out.println("사과의 개수 : " + appleNum + "개");
	}
}
class Orange extends Fruit{		//오렌지 <== 자식클래스
	//자식 클래스만 가지는 필드 1, 메소드 1
	int orangeNum;
	void orange() {
		System.out.println("오렌지의 개수 : " + orangeNum + "개");
	}
}
class Banana extends Fruit{		//바나나 <== 자식클래스
	//자식 클래스만 가지는 필드 1, 메소드 1
	int bananaNum;
	void banana() {
		System.out.println("바나나의 개수 : " + bananaNum + "개");
	}
	
}


public class Using_Inheritance02 {

	public static void main(String[] args) {

		//사과 
		System.out.println("==사과 정보==");
		Apple a = new Apple();
		a.name = "사과";
		a.color = "빨간색";
		a.large = 10;
		a.appleNum = 100;
		a.eat();
		a.print();
		a.apple();
		
		//오렌지
		System.out.println("\n==오렌지 정보==");
		Orange o = new Orange();
		o.name = "오렌지";
		o.color = "주황색";
		o.large = 5;
		o.orangeNum = 50;
		o.eat();
		o.print();
		o.orange();
		
		//바나나
		System.out.println("\n==바나나 정보==");
		Banana b = new Banana();
		b.name = "바나나";
		b.color = "노란색";
		b.large = 7;
		b.bananaNum = 1000;
		b.eat();
		b.print();
		b.banana();
		
		
	}

}
