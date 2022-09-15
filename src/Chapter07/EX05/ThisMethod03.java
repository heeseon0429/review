package Chapter07.EX05;

class Book {
	
	String bookName;		// 책 이름
	String author;			// 책 저자
	
	Book() {
		bookName = "책 이름 없음";
		author = "작자 미상";
	}
	
	Book(String bookName) {
		this();
		this.bookName = bookName;
	}
	
	Book(String bookName, String author) {
		this(bookName);				// this() 메서드: 자신이 속한 클래스 내의 다른 생성자 호출
		this.author = author;		// this. 키워드 : 자신이 속한 클래스의 객체(필드, 메서드)를 가리키는 참조 변수
	}
	
	void print() {		// 메모리의 필드 값을 출력하는 메서드
		System.out.println("책 이름: " + bookName);
		System.out.println("책 저자: " + author);
	}
	
}

public class ThisMethod03 {
	
	public static void main(String[] args) {
		
		// 1. 기본 생성자 호출
		System.out.println("===기본 생성자 호출===");
		Book book1 = new Book();
		book1.print();
		
		// 2. 입력매개변수 1개인 생성자 호출
		System.out.println("===입력매개변수 1개인 생성자 호출===");
		Book book2 = new Book("심청전");
		book2.print();
		
		// 3. 입력매개변수 2개인 생성자 호출
		System.out.println("===입력매개변수 2개인 생성자 호출===");
		Book book3 = new Book("홍길동전", "허균");
		book3.print();
		
		// 4. 입력매개변수 2개인 생성자 호출
		System.out.println("===입력매개변수 2개인 생성자 호출===");
		Book book4 = new Book("어린왕자", "생텍쥐베리");
		book4.print();
		
		// 5. 입력매개변수 1개인 생성자 호출
		System.out.println("===입력매개변수 1개인 생성자 호출===");
		Book book5 = new Book("포청천뎐");
		book5.print();
		
	}

}
