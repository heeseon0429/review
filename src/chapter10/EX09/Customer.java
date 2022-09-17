package chapter10.EX09;

public class Customer {
	
	int customerID;			// 고객 ID
	String customerName;	// 고객 이름
	String customerGrade;	// 고객 등급(VIP, Gold, Silver)
	int bonusPoint;			// 고객의 등급에 따라 적립되는 포인트
	double bonusRatio;		// 물품 구매 시 할인율
	
	Customer() {
		// 필드의 기본값 할당을 메서드 호출로 적용
		initCustomer();		// this.initCustomer(), 자신 객체의 메서드 호출
	}
	Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}
	void initCustomer() {
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}


	public static void main(String[] args) {
		//

	}

}
