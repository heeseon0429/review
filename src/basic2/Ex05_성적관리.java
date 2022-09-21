package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_성적관리 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		 System.out.print("입력할 학생 수를 입력하세요 : ");	//입력할 학생 수
		 int num = input.nextInt();// 학생수
		 System.out.println();
		 input.nextLine(); //엔터키 
		 
		 int[][] score = new int [num][3]; //점수 입력받을 배열
		 
		 for(int i = 0; i < score.length; i++) {
			 System.out.println(i +1 + "번째 학생의 국어/영어/수학 성적을 입력" );
				String inputScore = input.nextLine();  // "10/20/30"
				StringTokenizer st = new StringTokenizer(inputScore, "/");
				for(int j=0; st.hasMoreTokens(); j++) {
					String str = st.nextToken();
					score[i][j] = Integer.parseInt(str);
				}
		 		}
		 
			//
			for(int i =0; i<score.length; i++) {
				int sum = 0;
			for(int j =0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			System.out.println(i+1 + "번 학생의 총점은" + sum + "이고, 평균은" + sum/3.0 + "입니다.");
			
			}
			//
			int korScore = 0;
			int engScore = 0;
			int mathScore= 0;
			for(int i  =0; i < score.length; i++) {
				korScore += score[i][0];
				engScore += score[i][1];
				mathScore += score[i][2];
			}
			System.out.println("======================================");
			System.out.println("국어과목 충점은 " + korScore + "이고, 평균은 " + korScore/(double)num);
			System.out.println("영어과목 충점은 " + engScore + "이고, 평균은 " + engScore/(double)num);
			System.out.println("수학과목 충점은 " + mathScore + "이고, 평균은 " + mathScore/(double)num);
	 }
			
		 
		 

	
		
	}


