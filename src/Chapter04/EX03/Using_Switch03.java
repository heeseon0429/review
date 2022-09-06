package Chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		/* 1. 문제
		     스캐너로 "Gold"를 넣으면 "금메달 입니다"를 출력
		     스캐너로 "Silver"를 넣으면 "은메달 입니다"를 출력
		     스캐너로 "Bronze"를 넣으면 "동메달 입니다"를 출력
		     그외는 "메달이 없습니다."
		     
		   2. 문제
		     스캐너로 월을 인풋받아서 해당월의 총 날짜를 
		     "<월>은 <몇일>일까지 있습니다."
		     
		 */

	    System.out.println("메달의 종류는 무엇인가요");
	    System.out.println("Gold, Silver, Bronze");
	    System.out.println(" : ");
		
		Scanner sc = new Scanner (System.in);
		String aa = sc.next();
		
		switch (aa) {
		case "Gold":
			System.out.println("금메달 입니다");
			break;
		case "Silver":
			System.out.println("은메달 입니다");
			break;
		case "Bronze":
			System.out.println("동메달 입니다");
			break;
		default :
			System.out.println("메달이 없습니다. ");
			break;
		}
		
		System.out.println("========================");
		System.out.println("달을 입력해 주세요");
		//System.out.println("1,2,3,4,5,6,7,8,9,10,11,12");
		System.out.println(" :");
		
		int bb = sc.nextInt();
		
		switch (bb) {
		case 1 : case 3 : case 5:  case 7: case 8: case 10: case 12: 
			System.out.println("31일입니다.");
			break;
		case 2 :
			System.out.println("28일입니다.");
			break;
		case 4 : case 6: case 9: case 11:
			System.out.println("30일입니다.");
			break;
		default:
			System.out.println("존재하지 않는 달입니다.");
			
		}
		sc.close();
	}

}
