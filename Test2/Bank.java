package Test2;

public class Bank {

	String name;
	String number;
	int bankmoney;
	
	
	public void output(int a) { // 인출 
			if(bankmoney-a < 0) {
				System.out.println("잔액이 부족합니다");
		}else {
			System.out.printf("고객님께서 인출하신 금액은 %d원 입니다", a);
			System.out.println();
			bankmoney = bankmoney-a;
		}
		
	}
	
	public void input(int a) {
		System.out.printf("고객님께서 입금하신 금액은 %d원 입니다", a);
		System.out.println();
		bankmoney = bankmoney +a;
	}
	
	@Override
	public String toString() {
		return "예금주 : " + name + ",  계좌번호 : " + number + ", 잔액 : " + bankmoney;
	}
	
	public static void main(String[] args) {

		Bank b1 = new Bank();
		b1.name = "자바맨";
		b1.number = "123-456";
		b1.bankmoney = 1000;
		
		b1.output(5000);
		b1.output(500);
		
		b1.input(10000);
		
		System.out.println(b1.toString());
		
	}

}
