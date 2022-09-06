package Chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		//에스프레소, 카페라떼, 아포카토 주문할 경우 가격이 3,500원
		//아메리카노를 주문할 경우 : 2,500원
        //그외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴 입니다.
		
		//출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
		//      우리 매장에 없는 메뉴 입니다.
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("주문할 메뉴를 고르세요>>>");
		String order = sc.next();
		String price;
		
		if (order.equals("에스프레소") || order.equals("카페라떼") || order.equals("아포카토")) {
		price = "3,500";
		System.out.println("주문하신" + "a" + "는 가격이" + price + "원 입니다.");
		} else if (order.equals("아메리카노")) {
		price = "2,500";
		System.out.println("우리 매장에 없는 메뉴입니다. ");
		
		
		}
	
	    	
	    
	}

}

