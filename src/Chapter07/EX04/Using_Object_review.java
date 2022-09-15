package Chapter07.EX04;

class Person {
	// class: 객체를 생성하기 위한 템플ㄹ릿
	// object(객체, 인스턴스): 붕어빵, 건축물 <= 인스턴스화
	
	// 1. 필드: 클래스 중괄호에서 선언된 변수, 초기화하지 않을 시 강제 초기화
	// 	  지역 변수: 메서드 중괄호에서 선언된 변수, 강제 초기화 X
	String name;			// 이름		: null
	float height;			// 키		: 0.0
	float weight;			// 몸무게		: 0.0
	int age;				// 나이		: 0
	
	/* 2. 생성자(Constructor)
	 * 		(1) 리턴 타입이 없다(리턴하지 않는다는 뜻이 아니다)
	 * 		(2) 클래스 이름과 동일해야 한다
	 *  생성자의 역할: 객체 생성, 필드의 초기화
	 *  생성자 오버로딩: 여러 개의 동일한 이름을 지닌 생성자를 같은 공간에 정의하는 것
	 *  			 시그니처(입력매개변수 타입, 개수)가 다르면 생성자명이 동일해도 다른 생성자로 인식
	 */
	Person() {				// 기본 생성자: 비어 있는 생성자, 생략 가능		
	}
	Person(String name) {
		this.name = name;
	}
	Person(String name, float height) {
		this.name = name;
		this.height = height;
	}
	Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	Person(String name, float height, float weight, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	// 3. 메서드(함수): 기능을 실행하는 코드 저장, 호출 시 작동, 메서드명()
	void show() {			// 필드의 내용 출력
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("나이: " + age);
	}

	// 4. Getter, Setter: 필드의 내용을 출력 / 입력
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Using_Object_review {

	public static void main(String[] args) {
		// 객체 생성, main method
		Person person = new Person();
		
		// 1. 필드 내용 출력
		// (1) 객체 이름으로 출력
		System.out.println("=====객체 이름으로 출력=====");
		System.out.println(person.name);
		System.out.println(person.height);
		System.out.println(person.weight);
		System.out.println(person.age);
		
		// (2) getter를 사용하여 출력
		System.out.println("=====getter 사용 출력=====");
		System.out.println(person.getName());
		System.out.println(person.getHeight());
		System.out.println(person.getWeight());
		System.out.println(person.getAge());
		
		// (3) 출력 메서드를 이용하여 출력
		System.out.println("=====show() 메서드 사용 출력=====");
		person.show();
		
		// 2. 입력매개변수가 1개인 생성자 호출
		System.out.println("=====입력매개변수가 1개인 생성자 호출=====");
		Person lee = new Person("이순신");
		System.out.println(lee.name);			// 이순신
		System.out.println(lee.height);			// 0.0
		System.out.println(lee.weight);			// 0.0
		System.out.println(lee.age);			// 0
		lee.show();
		
		// 3. 입력매개변수가 4개인 생성자 호출
		System.out.println("=====입력매개변수가 4개인 생성자 호출=====");
		Person hong = new Person("홍길동", 185.5f, 80.54f, 24);
		System.out.println(hong.name);			
		System.out.println(hong.height);			
		System.out.println(hong.weight);			
		System.out.println(hong.age);			
		hong.show();
		
		// Setter 이용하여 필드값 할당, Getter 사용해서 필드값 출력
		System.out.println("=====Getter / Setter 사용=====");
		Person jung = new Person();
		
		// Setter 사용하여 필드값 할당
		jung.setName("정도령");
		jung.setHeight(175.5F);
		jung.setWeight(85.3F);
		jung.setAge(40);
		
		// Getter 사용하여 필드값 호출
		System.out.println(jung.getName());
		System.out.println(jung.getAge());
		System.out.println(jung.getHeight());
		System.out.println(jung.getWeight());
		
	}

}
