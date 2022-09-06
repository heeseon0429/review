package Chapter04.EX07;

public class Using_Continue {

	public static void main(String[] args) {
		//continue : continue를 만나면 continue 아래의 코드를 실행하지 않고 반복
		//  - if 문과 같이 사용됨.
		
		// 1. 단일 Loop에서 continue
		for (int i = 0 ; i < 10; i++) { //0~9 : 10번
			System.out.println("A");
			continue;           //구문을 빠져나가지 않고  
			//System.out.println("B");    //도달할 수 없는 코드
		}
		
		for (int i = 0 ; i < 10; i++) { //0~9 : 10번
			System.out.println("A");
			if ( i % 2 == 0) {continue;}  // i : 0, 2, 4, 6, 8(짝수일 때)
			System.out.println("B");
		}
		
		System.out.println("============================");
		for (int i = 0 ; i < 10 ; i++) {
			if(i ==5 || i==7) {continue;}
			System.out.print(i + " ");
		}
		
		//1. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		// 3의 배수만 출력 하세요.
		System.out.println("=======3의 배수만 출력하기==========");
		for (int i =1; i <= 1000; i++ ) {
		 if(i % 3 != 0) {continue;}
			System.out.print(i); //3의 배수만 출력
		}
		System.out.println("======5의 배수만 출력하기===========");
		//2. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
        // 5의 배수만 출력 하세요.
		for (int i = 1; i <= 1000 ; i++) {
			if ( i % 5 != 0) {continue; }    //5의 배수가 아닌것은 continue
			System.out.print(i);             //5의 배수만 출력
		}
		//3. for 문을 사용해서 1에서 1000까지 1씩 증가하고 if를 사용해서
		// 3, 5, 7의 배수만 출력 하세요.
		System.out.println("===3, 5, 7의 배수만 출력 하기===");
		for (int i = 1; i <= 1000 ; i++) {
			if (( i % 3== 0) || (i %5==0) || (i %7 ==0)) {
				
			System.out.print(i);       
	        }
			
			
			
		
			System.out.println("===================================");
			//2. 다중 Loop에서 continue
			for (int j = 0; j < 5 ; j++) {  // 5번
				for(int k = 0 ; k < 5; k++) { // 5번
					if(k == 3) {continue;}
      				System.out.println(j + " , " + k);
				}
			}
			
			System.out.println("======label를 사용해서 점프함===========");
			out : for (int j = 0; j < 5 ; j++) {  // 5번
				for(int k = 0 ; k < 5; k++) { // 5번
					if(k == 3) {continue out;}
      				System.out.println(j + " , " + k);
				}			
		}
			
		System.out.println("======================");
		out : for (int j = 0; j < 5 ; j++) {  // 5번
			for(int k = 0 ; k < 5; k++) { // 5번
				if(k == 3){
					j = 100;   //바깥쪽 for 문의 변수값을 증대 시켜서 false 빠져나옴.
					continue out;}
				System.out.println(j + " , " + k);
				}
			}			
			
			
		
	}
	}
	}
