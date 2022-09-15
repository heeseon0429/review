package chapter09.EX04;

class Student {
	static int studentNum = 1000;
	int studentID; // 학생 고유 번호
	String studentName; // 학생 이름
	int grade = 4; // 학생 학년 : 기본값 4학년
	String address = "서울"; // 주소 : "서울"

	Student(String studentName) {
		this.studentID = ++studentNum;
		this.studentName = studentName;
	}

	Student(String studentName, String address) {
		this(studentName);
		this.address = address;
	}

	void print() {
		System.out.println("학생 고유 번호 : " + studentID);
		System.out.println("학생 이름 : " + studentName);
		System.out.println("학생 학년 : " + grade);
		System.out.println("학생 주소 : " + address);
		System.out.println();

	}
}

public class Student_Test {

	public static void main(String[] args) {
		//
		// 객체를 생성할때 자동으로 학번이 1000번부터 1씩 자동으로 저장되어야 한다.
		// StudendID : 1000 부터 학생 객체를 생성할 때 마다 고유한 값으로 적용 되어 있어야 한다.

		Student lee = new Student("이지원"); // 1001번
		lee.print();
		Student hong = new Student("홍지원"); // 1002번
		hong.print();
		Student jung = new Student("정지원"); // 1003번
		jung.print();
		Student park = new Student("박지원", "부산"); // 1004번
		park.print();
		
		lee.print();
		hong.print();
		jung.print();
		park.print();

	}

}
