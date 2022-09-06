package Chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		// 스캐너로 인풋받아 임의의 정수를 10개 등록후
		//  정수 배열 방 10개를 생성하고
		// 임의의 값을 10개에 방에 저장
		// 그 중 최대값을 뽑아서 출력하는 프로그램을 생성해 보세요.
		// 출력 : 배열방 10개에서 최대값은 : 000
		
		Scanner sc = new Scanner (System.in);
	
		
		
		int [] a = new int[10];
		int max = a[0];
		int min = a[0];
		System.out.println("10개의 정수를 입력하세요");
		for(int i = 0 ; i < a.length; i++ ) {
			int b =sc.nextInt();
			
			a[i]= b;
			if(a[i] > max ) {
			max=a[i];
			}
		}
		System.out.println("최대값 :"+ max);
		
		for(int i = 0 ; i < 10 ; i++) {
			if(a[i] < min) {
				min=a[i];
			}
		}
		System.out.println("최소값 : "+ min);
		
		
		System.out.println("======2번째 방법은 Arrays.sort() 메소드를 사용해서 출력======");
		Arrays.sort(a);   //배열 방의 값을 정렬을 한다. 0(최솟값), 1, 2, 3......a.length -1 (최대값)
		System.out.println("최대값 : " + a[a.length-1]);     //최대값
		System.out.println("최소값 :" + a[0]);
		
		System.out.println("====Stream을 사용하는 경우====");
		System.out.println("최대값 : " + Arrays.stream(a).max().getAsInt());
		System.out.println("최소값 : " + Arrays.stream(a).min().getAsInt());
	
			
}
}
