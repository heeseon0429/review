package basic3;

import java.util.Scanner;

public class Cafe_Method3 {

	static void multiple() {

	}
	static void multiple(int a, int b) {
		System.out.println(a*b);
	}
	static void multiple(int a, char b) {
		for(int i =0; i <a ;i++) {
			System.out.println(b);
		}
		System.out.println();
	}
	static void multiple(int a, int b, char c) {
		for(int i =0; i <a; i++) {
			for(int j=0; j < b; j++)
				System.out.println(c);
		}
		System.out.println();
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		char c = sc.next().charAt(0);
		System.out.println("숫자 1를 입력하세요");
		int n1 = sc.nextInt();
		System.out.println("숫자 2를 입력하세요");
		int n2 = sc.nextInt();
		
		multiple(n1,n2);
		System.out.println("==1번 출력==");
		multiple(n1,n2,c);
		System.out.println("==2번 출력==");
		
	}

}
