package basic2;

public class Ex01_while개념 {

	public static void main(String[] args) {

		//0. for문
		/*
		 System.out.println("1부터 10까지의 합");
		 int sum = 0;
		 for(int a = 1; a <=10; a++) {
			 sum += a;
		 }
			 System.out.println(sum);
		
			 
		//초기치를 반복블록 위로
		//증가치를 반복문 끝으로
		//조건문만 남아서 for -> while
			 
		//1. while
			 int sum = 0;
			 int a = 1;
			 while( a <=10 ) {
				 sum += a;
				 a++;
			 }
				 System.out.println(sum);
		*/
		
		//2. do~while 
			int sum = 0;
			int a = 1;
			 do {
				sum += a;
				a++;
			} while( a <=10 );
			System.out.println(sum);	 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	}
}
