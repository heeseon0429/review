package Chapter07.EX04;

class Car{
	// 1. 필드
	String company;			// 제조 회사
	String model;			// 자동차 모델
	String color;			// 자동차 색상
	double maxSpeed;		// 자동차 최대 출력
	
	// 2. 생성자
	Car() {
		
	}
	
	Car(String company, String model, String color, double maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 3. 메서드
	void show() {
		System.out.print("제조사: " + company + ", 모델명: " + model + ", 색상: " + color + ", 최대 출력: " + maxSpeed);
		System.out.println();
	}

	// 4. Getter / Setter
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}

public class Car_Test {

	public static void main(String[] args) {
		// 객체 생성
		// car1: 현대자동차 그랜져 <= 필드 값 직접 입력 / 출력
		System.out.println("=====car1 직접 입력/출력=====");
		Car car1 = new Car();
		
		car1.company = "현대자동차";
		car1.model = "그랜져";
		car1.color = "black";
		car1.maxSpeed = 200.0;

		System.out.print("제조사: " + car1.company + ", ");
		System.out.print("모델명: " + car1.model + ", ");
		System.out.print("색상: " + car1.color + ", ");
		System.out.print("최대 출력: " + car1.maxSpeed);
		System.out.println();
		
		// car2: 쌍용자동차 체어맨 <= 생성자 이용해 입력 / show() 이용해 출력
		System.out.println("=====car2 생성자 이용 입력 / 메서드 이용 출력=====");
		Car car2 = new Car("쌍용자동차", "체어맨", "blue", 210.0);
		
		car2.show();
		
		// car3: 기아자동차 k9   <= getter / setter 이용
		System.out.println("=====car3 getter / setter 이용=====");
		Car car3 = new Car();
		
		car3.setCompany("기아자동차");
		car3.setModel("k9");
		car3.setColor("red");
		car3.setMaxSpeed(220.0);
		
		System.out.println("제조사: " + car3.getCompany() + ", 모델명: " + car3.getModel() + ", 색상: " + car3.getColor() + ", 최대 출력: " + car3.getMaxSpeed());
		
	}
}
