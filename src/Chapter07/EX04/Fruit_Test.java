package Chapter07.EX04;

class Fruit {
	
	// 1. 필드
	String name;			// 과일 이름
	String color;			// 과일 색상
	int count;				// 과일 개수
	int sugarContent;		// 과일 당도
	
	// 2. 생성자
	Fruit() {
		
	}
	Fruit(String name, String color, int count, int sugarContent) {
		this.name = name;
		this.color = color;
		this.count = count;
		this.sugarContent = sugarContent;
	}
	
	// 3. 메서드: 필드 값을 모두 출력
	void show() {
		System.out.print("이름: " + name + ", 색상: " + color + ", 개수: " + count + ", 당도: " + sugarContent);
		System.out.println();
	}
	
	// 4. Getter / Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSugarContent() {
		return sugarContent;
	}
	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}
	
}

public class Fruit_Test {

	public static void main(String[] args) {
		// 1. banana 객체 생성 후 필드에 기본값 직접 입력, 직접 출력
		System.out.println("=====1. banana=====");
		Fruit banana = new Fruit();
		
		banana.name = "banana";
		banana.color = "yellow";
		banana.count = 3;
		banana.sugarContent = 10;
		
		System.out.print("이름: " + banana.name + ", ");
		System.out.print("색상: " + banana.color + ", ");
		System.out.print("개수: " + banana.count + ", ");
		System.out.print("당도: " + banana.sugarContent);
		System.out.println();
		
		// 2. apple: 생성자를 사용하여 4개 필드에 초기값 할당, show() 메서드로 출력
		System.out.println("=====2. apple=====");
		Fruit apple = new Fruit("apple", "red", 5, 7);
		
		apple.show();
		
		// 3. strawberry: Setter 이용하여 4개 필드 값 할당, Getter 이용하여 출력
		System.out.println("=====3. strawberry=====");
		Fruit strawberry = new Fruit();
		
		strawberry.setName("strawberry");
		strawberry.setColor("red");
		strawberry.setCount(7);
		strawberry.setSugarContent(8);
		
		System.out.print("이름: " + strawberry.getName() + ", ");
		System.out.print("색상: " + strawberry.getColor() + ", ");
		System.out.print("개수: " + strawberry.getCount() + ", ");
		System.out.print("당도: " + strawberry.getSugarContent());
		System.out.println();
	}

}
