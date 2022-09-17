package chapter10.EX07;

import java.util.Arrays;

class Animal {
	// 자식 클래스에서 2개의 메서드를 오버라이딩
	// Animal 타입으로 생성, 배열에 저장 후, 오버라이딩된 메소드 출력(for문, Enhanced for문)
	void run() {
		System.out.println("모든 동물은 달립니다");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다");
	}
}
class Tiger extends Animal {
	int a;			// 호랑이 수
	Tiger(int tiger) {
		this.a = tiger;
	}
	@Override
	void run() {
		System.out.println("호랑이는 맹렬히 달립니다");
	}
	@Override
	void eat() {
		System.out.println("호랑이는 사람을 잡아먹습니다");
	}
}
class Egle extends Animal {
	int a;			// 독수리 수
	Egle(int egle) {
		this.a = egle;
	}
	@Override
	void run() {
		System.out.println("독수리는 날아다닙니다");
	}
	@Override
	void eat() {
		System.out.println("독수리는 사냥을 해 잡아먹습니다");
	}
}
class Fish extends Animal {
	int a;			// 물고기 수
	Fish(int fish) {
		this.a = fish;
	}
	@Override
	void run() {
		System.out.println("물고기는 헤엄을 칩니다");
	}
	@Override
	void eat() {
		System.out.println("물고기는 플랑크톤을 먹습니다");
	}
}
class Dog extends Animal {
	int a;			// 개 수
	Dog(int dog) {
		this.a = dog;
	}
	@Override
	void run() {
		System.out.println("개는 귀엽게 달립니다");
	}
	@Override
	void eat() {
		System.out.println("개는 사료를 먹습니다");
	}
}

public class Using_Method_Overriding04 {

	public static void main(String[] args) {
		// 1. 객체 생성
		// 1. 객체 생성(Animal 타입으로 생성)
			// 생성자를 통해서 각각의 필드에 값을 할당
		Animal aa1 = new Animal();
		Animal aa2 = new Tiger(10);
		Animal aa3 = new Egle(5);
		Animal aa4 = new Fish(50);
		Animal aa5 = new Dog(70);
		
		// 2. 각 객체를 배열에 저장
		Animal[] arr = new Animal[] {aa1,aa2,aa3,aa4,aa5};

		
		// 3. for문을 사용해서 출력: eat(), run(), 동물의 총 마리 수: 00
			// 1. for문을 사용해서 객체를 Animal 객체로 뽑아서
			// 2. 다운캐스팅해서 자식 필드의 count 읽어서 총 더한 값을 출력
		
		/*	배열 형태로 클래스명을 넣으려고 해 보았으나 이 방법은 사용할 수 없다
		 	String[] type = new String[] {"Tiger", "Egle", "Fish", "Dog"};
			System.out.println(Arrays.toString(type));
		*/
		
		// ===============나의 풀이===============
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i].run();
			arr[i].eat();
			System.out.println();
		if( arr[i] instanceof Tiger) {
			Tiger tt = (Tiger) arr[i];	
			sum += tt.a;
		}
		if ( arr[i] instanceof Egle) {
			Egle ee = (Egle) arr[i];	
			sum += ee.a;
		}
		if ( arr[i] instanceof Fish) {
			Fish ff = (Fish) arr[i];
			sum += ff.a;
		}
		if ( arr[i] instanceof Dog ) {
			Dog dd = (Dog) arr[i];
			sum += dd.a;
		}
		if ( i == arr.length - 1) {
			System.out.println("동물의 총 마리 수: " + sum + "마리");
		}
		}
		
		// ===============강사님 풀이===============
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			
		//배열의 각 방에 저장된 객체를 Animal 객체에 저장
		Animal aa = arr[i];
		aa.run();				// Animal의 eat() 메서드: 오버라이딩된 메서드 출력
		aa.eat();				// Animal의 run() 메서드: 오버라이딩된 메서드 출력
		System.out.println();
		if (aa instanceof Tiger) {
			Tiger t1 = (Tiger) aa;
			sum2 += t1.a;
		}
		if (aa instanceof Egle) {
			Egle e1 = (Egle) aa;
			sum2 += e1.a;
		}
		if (aa instanceof Fish) {
			Fish f1 = (Fish) aa;
			sum2 += f1.a;
		}
		if (aa instanceof Dog) {
			Dog d1 = (Dog) aa;
			sum2 += d1.a;
		}
		}
		System.out.println("총 동물의 수는: " + sum2 + "마리");
	}

}
