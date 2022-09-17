package chapter10.EX06;

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
	int tiger;			// 호랑이 수
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
	int egle;			// 독수리 수
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
	int fish;			// 물고기 수
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
	int dog;			// 개 수
	@Override
	void run() {
		System.out.println("개는 귀엽게 달립니다");
	}
	@Override
	void eat() {
		System.out.println("개는 사료를 먹습니다");
	}
}

public class Using_Method_Overriding03 {

	public static void main(String[] args) {
		// 1. Animal 타입으로 생성
		Animal aa = new Animal();
		Animal aa1 = new Tiger();
		Animal aa2 = new Egle();
		Animal aa3 = new Fish();
		Animal aa4 = new Dog();
		
		// 2. 각 객체를 배열에 저장
		Animal[] arr1 = new Animal[] {aa,aa1, aa2, aa3, aa4};
		
		// 3. 오버라이딩된 메서드 출력(for문)
		System.out.println("=====for문 출력=====");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i].run();
			arr1[i].eat();
			System.out.println();
		}
		
		// 4. 오버라이딘됭 메서드 출력(Enhanced for문)
		System.out.println("=====Enhanced for문 출력=====");
		for (Animal animal: arr1) {
			animal.run();
			animal.eat();
			System.out.println();
		}
	}

}
