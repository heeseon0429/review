package Chapter07.EX05;

// 반드시 this keyword를 사용해야 하는 경우:
//		- 생성자, 지역 변수 이름, 필드 이름이 동일한 경우 => 필드 이름에 this.를 명시애햐 한다 

class AA {
	int m;
	int n;
	
	void init(int m, int n) {		// this.를 명시하지 않은 경우
		m = m;				// 지역 변수와 필드 모두를 사용할 수 있는 영역에서는 사용 범위가 좁은 변수, 즉 !!지역 변수!!로 인식
		n = n;				// m, n 모두 지역 변수
	}
}

class BB {
	int m;
	int n;
	
	void init(int m, int n) {		// this.를 명시한 경우
		this.m = m;			// this.m: 필드, m: 지역 변수
		this.n = n;
	}
}

public class ThisKeyword02 {

	public static void main(String[] args) {
		
		AA aa = new AA();			// 기본 생성자 호출
		aa.init(10, 20);
		System.out.println(aa.m);	// 0
		System.out.println(aa.n);	// 0
		
		BB bb = new BB();
		bb.init(10, 20);
		System.out.println(bb.m);	// 10
		System.out.println(bb.n);	// 20

	}

}
