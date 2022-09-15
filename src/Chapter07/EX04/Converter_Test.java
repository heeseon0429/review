package Chapter07.EX04;

import java.util.Scanner;

class Converter{		// 환율을 계산하는 클래스
	// 1. 필드 생성
	double rate;		// 환율 저장
	
	// 2. 메서드 생성(달러를 입력받아 원화로 변환) / 메서드명: toKWR()
	double toKWR(double dollar) {
		return dollar * rate;
	}
	
	// 3. 메서드 생성(원화를 입력받아 달러로 변환) / 메서드명: toDollar()
	double toDollar(double won) {
		return won / rate;
	}

	// 4. setRate() 메서드를 사용하여 rate 필드값 할당
	public void setRate(double rate) {
		this.rate = rate;
	}
}

public class Converter_Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1$에 대한 오늘의 환율을 입력하세요 >>>");
		double rate = sc.nextDouble();
		
		//객체 생성
		Converter converter = new Converter();		// 기본 생성자 호출
		
		// 스캐너로 받은 rate 변수값을 setRate() 메서드를 통해 rate에 주입
		converter.setRate(rate);
		
		// 100만 원 => 몇 $?
		System.out.println("원화 100만 원: " + converter.toDollar(1000000) + "$");
		
		// 100$ => 몇 원?
		System.out.println("달러 100$: " + converter.toKWR(100) + "원");
		
		// 1. printf()를 사용하여 출력
		System.out.println("=====소수점 둘째 자리까지 잘라서 출력(printf())=====");
		
		System.out.printf("원화 100만 원: %.2f$\n", converter.toDollar(1000000));
		System.out.printf("달러 100$: %.2f원\n", converter.toKWR(100));
		
		// 2. 변수에 더블 값을 할당 후 소수점 2자리까지 변환해서 출력
		System.out.println("=====예시=====");
		double per2 = 3.141592;
				// String으로 변환 후 per2의 변수값을 소수점 2자리까지 출력 후 다시 더블형으로 변환
		double per1 = Double.parseDouble(String.format("%10.2f", per2));
		System.out.println(per1);
		
		System.out.println("=====실수를 변수에 할당 후 소수점 2자리까지 잘라서 다시 더블에 지정=====");
		double d2 = converter.toDollar(1000000);
		double d1 = Double.parseDouble(String.format("%.2f", d2));
		System.out.println("원화 100만 원: " + d1 + "$");
		
		double d4 = converter.toKWR(100);
		double d3 = Double.parseDouble(String.format("%.2f", d4));
		System.out.println("달러 100$: " + d3 + "원");
		
	}

}
