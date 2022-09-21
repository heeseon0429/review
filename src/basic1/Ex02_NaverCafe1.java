package basic1;

import java.util.Scanner;

public class Ex02_NaverCafe1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("학번을 입력해 주세요");

		String id = input.nextLine();

		String year = id.substring(0,4);

		char college = id.charAt(4);

		String a= null;
		if (college == '1') {
			a = "공대";
		}else if (college == '2') {
			a = "사회대";
		}

		String b = id.substring(5,7);
		
		int bb = Integer.parseInt(b);

		String cal = null;

		if (college == '1') {
		switch (bb) {
		case 11 : cal = "컴퓨터학과"; break;
		case 12 : cal = "소프트웨어학과"; break;
		case 13 : cal = "모바일학과"; break;
		case 22 : cal = "자바학과"; break;
		case 33 : cal = "서버학과"; break;
		default :
		System.out.println("잘못입력 하셨습니다.");
		}
		}
		else if(college == '2') {
		switch (bb) {
		case 11 : cal = "사회학과"; break;
		case 12 : cal = "경영학과"; break;
		case 13 : cal = "경제학과"; break;
		default :
		System.out.println("잘못입력 하셨습니다.");
		}
		}
		System.out.println(id +" 는 "+ year +"년도에 입학한 "+a+" "+cal+" 학생입니다." );
	}
}
