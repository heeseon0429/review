package inherit;

public class MainTest {

	public static void main(String[] args) {
		/*
		//Umma u = new Umma();
		//u.job();
		//u.gene();
		
		Ddal d = new Ddal();
		d.study();
		d.job();
		d.gene();
		*/
		
		//Ddal d = new Umma(); 딸 변수에 부모객체 생성 불가능
		
		/*
		// * 부모변수에 자식객체 생성이 가능
		Umma u = new Ddal();
		u.gene();
		u.job();
		//u.study(); 
		*/

		// * 형변환 : ( casting )
		//   1) 기본형끼리
		//   2) 참조형에서 상속관계있는 경우만 가능
		
		//     String s = new String("~");
		//     StringBuffer sb = (StringBuffer)s; --> X
		
		//Umma u = new  Umma();
		//Ddal d = (Ddal)u;
		
		
		Ddal d = new Ddal();
		Umma u = (Umma)d;		//up casting
		Ddal d2 = (Ddal)u;		//down casting
		
		
		
		
	}

}
