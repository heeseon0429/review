package chapter09.EX04;

class Student02{
	
	//필드의 접근 제어자 : default로 구성됨 : -외부 클래스에서 객체를 생성 후 직접 수정이 가능함.
	static int studentNum = 1000;
	int studentID; 					// 학생 고유 번호
	String studentName; 			// 학생 이름
	int grade = 4; 					// 학생 학년 : 기본값 4학년
	String address = "서울";			// 주소 : "서울"
}

class Student03{
	//필드의 접근 제어자는 보안을 위해서 private으로 선언 할 수 있다.
	//	- 필드의 값을 직접적으로 수정 할 수 없다.
	// - 
	
	private static int studentNum = 1000;
	private int studentID; // 학생 고유 번호
	private String studentName; // 학생 이름
	private int grade = 4; // 학생 학년 : 기본값 4학년 (1~4)
	private String address = "서울"; // 주소 : "서울"
	private int month;	//값 : 1~12까지만
	
	//필드의 접근 제어자를 private으로 설정하면 외부 클래스에서 접근할 수 없다.
		//생성자나 메소드(Setter)를 사용해서 필드의 내용을 수정
			//원하는 값을(제어해서) 입력을 할 수 있다.
	
	Student03(){
		studentNum ++;
		studentID = studentNum;
		grade = 4;
		address = "서울";
	}
	Student03(String studentName){
		this();
		this.studentName = studentName;
	}
	void print() {
		System.out.println("학생 ID : " + studentID);
		System.out.println("학생 이름 : " + studentName);
		System.out.println("학년 : " + grade);
		System.out.println("주소 : " + address);
		System.out.println("개월 : " + month);
		System.out.println("=========================");
	}
	
	public void setGrade(int grade){
		if(grade > 0 && grade < 5) {
			this.grade = grade;
		}else {
			System.out.println("잘못된 값을 입력했습니다. 1 ~ 4 사이의 값만 입력하세요");
			return;
		}
	}
	public void setMonth(int month) {
		if(month > 0 && month < 13) {
			this.month = month;
		}else {
			System.out.println("잘못된 값을 입력했습니다. 1 ~ 12 사이의 값만 입력하세요");
			return;
		}
	}
	
	
}

public class Student_Test02 {

	public static void main(String[] args) {
		// 객체 생성
		Student02 s = new Student02();
		
		//default 접근 제어자 : 동일한 패키지에 존재하는 클래스에서 필드의 값을 직접 수정
		s.studentNum = 2000;
		s.studentID = 100;
		s.studentName = "홍길동";
//		System.out.println(s.studentNum);
		
		//객체 생성
		Student03 ss = new Student03("홍길동");
		
		//private 접근 제어자	: 외부에서 접근 불가
//		ss.studentNum = 3000;
		
		//필드의 값을 직접 입력하는 경우는 넣는 값을 제어 할 수 없다.
//		ss.grade = 100;	//1~4
//		ss.month = 200;	//1~12
		
		ss.setGrade(4);
		ss.setMonth(9);

		ss.print();
	}

}
