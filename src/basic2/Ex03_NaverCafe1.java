package basic2;

import java.util.Scanner;

public class Ex03_NaverCafe1 {

	public static void main(String[] args) {
		
		//NaverCafe_회사B
		
		Scanner sc = new Scanner(System.in);
		System.out.println("num을 입력하세요");
		
		int num = 0;
		int count = sc.nextInt();
		
		for(int i = 1; i <= num; i++ ) {
			int su = i;
			boolean su369 = false;
			
			while(su!=0) {
				int na = su % 10 ;
				if(na == 3 || na == 6 || na == 9) {
					su369 = true;
				}
					su = su /10;
				}
				if(su369) {
					System.out.print("짝!");
					count=+1;
				}
				else {
					System.out.print(i + "-");
				}
			}
			System.out.println("\n손뼉 친 횟수는 :" + count);
		}
	}


