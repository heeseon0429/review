package Chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		//switch 문으로 처리
		//스캐너 사용
		//에스프레소, 카페라떼, 아포카토 주문할 경우 가격이 3,500원
		//아메리카노를 주문할 경우 : 2,500원
        //그외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴 입니다
		
		//출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
		//      우리 매장에 없는 메뉴 입니다.

		
		System.out.println("주문하실 메뉴를 선택해주세요");
		System.out.println("에스프레소, 카페라떼, 아포카토, 아메리카노");
		System.out.println(" : ");
		
		
		Scanner sc = new Scanner (System.in);
		String aa = sc.next();
		
		switch (aa) {
		case "에스프레소":
			System.out.println("주문하신 <에스프레소>의 가격은 <3500>원 입니다");
			break;
		case "카페라떼":
			System.out.println("주문하신 <카페라떼>의 가격은 <3500>원 입니다");
			break;
		case "아보카토":
			System.out.println("주문하신 <아포카토>의 가격은 <3500>원 입니다");
			break;
		case "아메리카노":
			System.out.println("주문하신 <아메리카노>의 가격은 <2500>원 입니다");
			break;
		default:
			System.out.println("우리 매장에는 없는 메뉴 입니다.");
			break;
	}
System.out.println("===================");

		Scanner sc1 = new Scanner (System.in);
		System.out.println("커피를 주문해주세요?>>>");
		String order = sc.next();
		int price = 0;
		
		switch (order) {
		case "에스츠레소": case "카페라떼": case"아포카토":
			price = 3500;
			break;
		case "아메리카노":
			price = 2500;
			break;
		default :
			System.out.println("우리 매장에 없는 메뉴입니다.");
			
	 System.out.println("주문하신 커피는 %s이고, 가격은 %d입니다, order, price");
	 
	 sc.close();
		}
}
}