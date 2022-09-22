package basic4;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		CalculatorExpr c = new CalculatorExpr();  
		
		Scanner sc = new Scanner(System.in);
		String answer;
		
		do {								
			System.out.println("num1을 입력하세요");
			int num1 = sc.nextInt();
			System.out.println("num2을 입력하세요");
			int num2 = sc.nextInt();
			
			c.setNum1(num1);
			c.setNum2(num2);
			
			// 결과 출력
			System.out.println("덧샘 : " + c.getAddition());
			System.out.println("뺄셈 : " + c.getSubtraction());
			System.out.println("곱셈 : " + c.getMultiplication());
			System.out.println("나눗셈 : " + c.getDivision());
			
			//계속 진행할 지 물어보기
			System.out.println("계속 진행하고 싶으면 Y를 입력하세요");
			answer = sc.next();}
		while (answer.equalsIgnoreCase("Y"));
		
		System.out.println("프로그램이 종료되었습니다");
			
			
		sc.close();
	}
		
	}

