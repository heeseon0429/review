package basic3;

public class Ex03_CallByValue {
//원본의 영향을 주지않음
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		add(a,b); //a와 b를 add 로 넘긴다
		System.out.println("A=" + a + ", B=" + b); //두번째 출력 a=30 b=20
	}
	
		static void add(int a , int b) {
		a += b;
		System.out.println("A=" + a + ", B=" + b); //첫번째 출력 a=10 b=20
	}

}
