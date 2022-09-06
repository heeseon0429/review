package Chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
		//이중 for 문을 사용해서 1단 ~ 9단까지 출력.
		/*		\n : enter, \t: tab
		      1*1=1	 1*2=2	1*3=3 ......	1*9=9
		      2*1=2	 2*2=4	2*3=6 ......	2*9=18
		      3*1=3	 3*2=6  3*3=9 ......	3*9=27
		      ....
		      9*1=9	 9*2=18 ...............9*9=8
		      
		 */
		
		for(int i= 1; i <10; i++) {
			for(int j =1; j <10; j++) {
				
				
				System.out.println(i + "*" + j + "=" + i *j );
              System.out.println("\t");
			}
			
		}
	System.out.println("==========================");
	
	// 1단 ~ 19단까지 3의 배수단만 출력
	 
	for(int h= 1; h <=19; h++) {
		for(int g =1; g <=19; g++) {
			if(h%3 ==0) {
			System.out.print(h + "*" + g + "=" + h*g + "\t");
			
			}
		}

	}
        //스캐너에서 입력 받은 단만 출력 (1~9단)
		//출력할 단을 입력하세요(1~9단)>>>
		// ===========
		// 1*1=1
		// 1*2=2
		// 1*3=3
		// ....
		// 1*9=9
		
		Scanner sc = new Scanner (System.in);
	    int i = sc.nextInt();
		System.out.println("단을 입력해주세요");
		for(int j = 1; j < 10 ; j++  ) {
			System.out.println(i + "*" + j + "= + i*j");
	    }
		sc.close();
			}

	
	}
	



