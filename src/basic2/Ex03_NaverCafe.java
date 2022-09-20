package basic2;

public class Ex03_NaverCafe {

	public static void main(String[] args) {

		//1~10000까지 8 몇번인가?
		//결과 4000
		int count = 0;
		for(int i= 1; i <= 10000; i++) {
			
			int m = i;
			
			while(m!=0) {
				int n = m % 10;
				
				if(n == 8) {
					count++;
				}
				m = m /10;
			}
			
		}
		System.out.println(count);
	}

}
