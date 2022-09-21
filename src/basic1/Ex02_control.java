package basic1;

import java.util.Calendar;

/*
 * 제어문 : 프로그램 흐름을 변경하기 위해
 * 
 * 		1) if
 * 		2) switch
 * 		3) for
 * 		4) while/ do~while
 * 
 * 		5) break / continue
 */

import java.util.Scanner;

public class Ex02_control {

	public static void main(String[] args) {

		String id = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("주민입력 ->");
		id = input.nextLine();
		
		
		//String id = "980429-1234567";
		
		System.out.println("=====성별=====");
		char sung = id.charAt(7);
		System.out.println(sung);
		
		//sung 변수에 문자가 1이거나 3이거나 9라면 남자출력
		//그렇지 않고 문자가 2이거나 4이거나 0이라면 여자출력
		
		if(sung == '1' || sung =='3' || sung =='9') {
			System.out.println("남자");
		}else if(sung == '2' || sung =='4' ||sung =='0'){
			System.out.println("여자");
		}
		
		System.out.println("=====출생=====");
		char chull = id.charAt(8);
		System.out.println(chull);
		//chull 변수가 0이라면 '서울'
		//chull 변수가 1이라면 '인천/부산'
		//chull 변수가 2이라면 '경기'
		//
		//chull 변수가 9이라면 '제주'
		String home = null;
		switch(chull) {//문자, 정수, 문자열	
		case '0': home = "서울"; break;
		case '1': home = "인천/부산"; break;
		case '2': home = "경기"; break;
		case '9': home = "제주";
		}
		System.out.println(home + "출신");
		
		System.out.println("=====나이=====");
		// String id = "801212-1234567";
		String nai = id.substring(0,2);     // nai = "80"
		// 문자열 -> 정수 변환
		int sunai = Integer.parseInt(nai);	//sunai = 80
		
		int age = 0;
		
		// String id = "201212-4234567";
		
		Calendar c =  Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		age = 2022 - (1900 + sunai) + 1;
		
		System.out.println(age);
		
		
				
	}

}
