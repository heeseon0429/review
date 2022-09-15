package chapter10.EX01;

//클래스 내부 구성요소 : 1. 필드 2.생성자 3. 메소드 4. 이너클래스

//클래스 외부 구성요소 : 1. 패키지 2. import 3. 외부클래스

//상속(Inheritance) : 객체지향 언어의 꽃
//		- 부모 클래스(super class) 의 필드와 메소드, 이너클래스를 자식 클래스에서 물려 준다.
//		- 자식 클래스(child class) 는 부모 클래스의 코드(
//		- 중복된 코드를 방지할 수 있다.
//		- 코드를 간결하게 사용.
//		- 유지보수가 쉬워짐
//		- 다형성 사용 : 부모 클래스의 메소드를 자식 클래스에서 재정의해서 사용
//			- 다양한 타입으로 사용이 가능하다.

//부모 클래스(super class) : 자식 클래스의 공통적인 특징을 가지는 클래스


class Human{		//사람 : 부모클래스 : 자식 클래스의 공통적인 필드와 메소드를 선언
	//필드
	String name;
	int age;
	
	//메소드 정의
	void eat() {
		System.out.println("모든 사람은 먹는다.");
	}
	void sleep() {
		System.out.println("모든 사람은 잠을 잔다.");
	}
	void print(){
		System.out.println(name +","+ age + "살");
	}
}
//자식클래스 : 부모 클래스의 필드와 메소드를 그대로 상속 받는다.
	// - 자식 클래스만의 특징이 적용된 필드와 메소드를 선언
class Student extends Human{		//Student class는 Human class를 상속받는다.
	
	//부모클래스의 필드와 메소드가 그대로 내려온다.
	//자식 클래스의 특징을 가진 필드와 메소드를 선언
	int studentID;			//자식 클래스에서 선언된 필드
	void goToSchool() {		//자식 클래스에서만 사용 가능한 메소드
		System.out.println("학생이 학교에 갑니다.");
		System.out.println(studentID + "번");
	}
}

class Worker extends Human{		//직장인
	//부모클래스의 필드와 메소드가 그대로 내려온다.
	int workerID;
	void goToWork() {
		System.out.println("직장인이 일 하러 갑니다.");
		System.out.println(workerID + "번");
		
	}
}

class Professor extends Human{	//교수
	//부모클래스의 필드와 메소드가 그대로 내려온다.
	int professorID;
	void goToCollage() {
		System.out.println("교수가 대학에 갑니다.");
		System.out.println(professorID + "번");
	}
}



public class Using_Inheritance01 {
	public static void main(String[] args) {
		
		//1. Human 클래스 객체 생성
		System.out.println("==Human 객체 출력==");
		Human h = new Human();
		
		h.name = "홍길동";
		h.age = 30;
	
		h.eat();
		h.sleep();
		h.print();
		System.out.println();

		//2. Student 클래스 객체 생성(자식)
		System.out.println("==Student 객체 출력==");
		Student s = new Student();
		s.name = "세종대왕";
		s.age = 17;
		s.studentID = 1000;
		
		s.eat();
		s.sleep();
		s.print();
		s.goToSchool();

		//3. Worker 클래스 객체 생성(자식)
		System.out.println("\n==Worker 객체 출력==");
		Worker w = new Worker();
		
		w.name = "신사임당";
		w.age = 40;
		w.workerID = 1001;
		
		w.eat();
		w.sleep();
		w.print();
		w.goToWork();
		
		//4. Professor 클래스의 객체 생성(자식)
		System.out.println("\n==Professor 객체 출력==");
		Professor p = new Professor();
		
		p.name = "이순신";
		p.age = 50;
		p.professorID = 1002;
		
		p.eat();
		p.sleep();
		p.print();
		p.goToCollage();
		
	}
}