package basic3;

import java.util.Scanner;

public class Cafe_Method2 {

	// 소문자이면 대문자로 변환하여 반환 대문자라면 그대로 반환
	static char checkUpper (char alphb) {

		if(alphb >= 'a' && alphb <= 'z') {//만약 alphb이 소문자라면
			alphb = Character.toUpperCase(alphb);// alphb을 대문자로 변환해주고
			return alphb; //반환해줌ㅁ
		}else//만약 소문자가 아니라 대문자
			return alphb;//그대로 리턴값
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검사할 영문자를 입력하세요");
		char alphb = sc.next().charAt(0);
		System.out.println(checkUpper(alphb));
	}


}