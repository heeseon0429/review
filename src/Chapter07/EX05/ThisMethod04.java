package Chapter07.EX05;

class Car {
	
	String companyName;		// 초기값: 현대자동차
	String color;			// 초기값: 검정색
	double maxSpeed;		// 초기값: 200.0 km/h
	
	// 생성자
	Car() {
		this.companyName = "현대자동차";
		this.color = "검정색";
		this.maxSpeed = 200.0;
	}
	Car(String companyName) {
		this();
		this.companyName = companyName;
	}
	Car(String companyName, String color) {
		this(companyName);
		this.color = color;
	}
	Car(String companyName, String color, double maxSpeed) {
		this(companyName, color);
		this.maxSpeed = maxSpeed;
	}
	
	// 필드의 모든 값을 출력하는 메서드
	void print() {
		System.out.println("차 이름: " + companyName);
		System.out.println("차 색상: " + color);
		System.out.println("최고 속도: " + maxSpeed + "km/h");
	}
}

public class ThisMethod04 {

	public static void main(String[] args) {
		// 1. 입력매개변수 0개, 기본 필드값 출력
		System.out.println("===입력매개변수 0개===");
		Car car1 = new Car();
		car1.print();
		
		// 2. 입력매개변수 1개, companyName만 출력, 나머지는 기본 필드값 출력
		System.out.println("===입력매개변수 1개===");
		Car car2 = new Car("기아자동차");
		car2.print();
		
		// 3. 입력매개변수 2개, companyName과 color 출력, maxSpeed는 기본 필드값 출력
		System.out.println("===입력매개변수 2개===");
		Car car3 = new Car("포르쉐", "빨강색");
		car3.print();
		
		// 4. 입력매개변수 3개, 모두 출력
		System.out.println("===입력매개변수 3개===");
		Car car4 = new Car("쉐보레", "노란색", 240.0);
		car4.print();
		
	}

}
