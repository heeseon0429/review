package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> result = method();
		//학생정보를 여기서 출력하시오
		for(Student s : result) {		// 향상된 for 문을 사용함.
			System.out.println(s);
		}
		
		// [참고] 전체요소를 순서대로 검색
		// 		Enumeration -> Iterator
		System.out.print("=====");
		Iterator it = result.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
	}
	
	
	
	static ArrayList<Student> method() {  // void 자리에 자료형 넣어주기 generics
		ArrayList<Student> list = new ArrayList<Student>();	//2
		list.add(new Student("홍길자", 25));
		list.add(new Student("홍길이", 33));
		list.add(new Student("홍삼이", 44));
		return list;			// 리턴값
	}
}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
