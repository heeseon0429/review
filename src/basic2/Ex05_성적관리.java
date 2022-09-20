package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_성적관리 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		 System.out.print("입력할 학생 수를 입력하세요 : ");	//입력할 학생 수
		 int num = input.nextInt();// 학생수
		 System.out.println();
		 
		 int[][] score = new int [num][3]; //점수 입력받을 배열
		 
		 for(int i = 0; i < score.length; i++) {
			 System.out.println(i +1 + "번째 학생의 국어/영어/수학 성적을 입력" );
				String inputData = input.nextLine();  // "10/20/30"
				StringTokenizer st = new StringTokenizer(inputData, "/");
				for(int j=0; st.hasMoreTokens(); j++) {
					String str = st.nextToken();
					score[i][j] = Integer.parseInt(str);
				}
			//출력
			for(int j =0; j<score.length; j++) {
				System.out.println(j + "번 학생의 점수 : " + score[i][j]);
				
			}
		 }
			
		 
		 

	
		
	}
}

