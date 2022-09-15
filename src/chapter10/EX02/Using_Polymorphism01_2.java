package chapter10.EX02;

class Animal{
	String name = "동물";
}

class Person extends Animal{
	String PersonName = "사람";
	
}
class Person_person extends Person{
	String pName = "사람_사람";
}

public class Using_Polymorphism01_2 {

	public static void main(String[] args) {
		// 1. Animal 객체 생성
			//Animal 객체는 Animal 타입만 내포
		System.out.println("====a1====");
		Animal a1 = new Animal();
		System.out.println(a1.name);
		
		// 2. Person 객체 생성
			//a2는 Animal, Person 타입을 내포하고 있고, Animal 타입으로 지정
			//Animal 타입의 필드, 메소드만 접근 가능, Person 타입으로 다운캐스팅이 가능
		System.out.println("====a2====");
		Animal a2 = new Person();
		System.out.println(a2.name);

		// 3. Person 다운캐스팅
		System.out.println("====p1====");
		Person p1 = (Person)a2;
		System.out.println(p1.name);
		System.out.println(p1.PersonName);
		
		// 4. Person_person 객체 생성
		System.out.println("====p2====");
		Person_person p2 = new Person_person();
		System.out.println(p2.name);
		System.out.println(p2.PersonName);
		System.out.println(p2.pName);
			//업캐스팅
		System.out.println("====a3====");
		Animal a3 = p2;
		System.out.println(a3.name);
			//다운캐스팅
		System.out.println("====p3====");
		Person p3 = (Person) a3;
		System.out.println(p3.name);
		System.out.println(p3.PersonName);
		
		// 5. Person_person 객체를 Animal 타입으로 생성
			//a4는 Animal , Person, Person_person 타입을 모두 내포하고 있고 Animal 타입으로 지정
		System.out.println("====a4====");
		Animal a4 = new Person_person();
		System.out.println(a4.name);
		
			//다운캐스팅
		System.out.println("====p5====");
		Person_person p5 = (Person_person) a4;
		System.out.println(p5.name);
		System.out.println(p5.PersonName);
		System.out.println(p5.pName);
		
			//Person_person 객체를 Person_person 타입으로 생성
		System.out.println("====p6====");
		Person_person p6 = new Person_person();
		System.out.println(p6.name);
		System.out.println(p6.PersonName);
		System.out.println(p6.pName);
		
		//6.Person_person 객체를 Person 타입으로 생성
			//p7은 Animal,Person 내포
		System.out.println("====p7====");
		Person p7 = p6;
		System.out.println(p7.name);
		System.out.println(p7.PersonName);
		
		System.out.println("====a5====");
		Animal a5 = p6;
		System.out.println(a5.name);
		
			
		
	}

}
