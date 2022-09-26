package a_sample;

import java.awt.BorderLayout;
import java.awt.Checkbox;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

/*
 *  자바의 GUI (화면)
 *  - AWT : 1.2이전
 *  - Swing : 1.2 이후
 *  		  대부분 클래스 앞에 J
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ATest {
	//변수 선언
	JFrame f;
	JButton btn, bCancel;
	Checkbox Java, Oracle; // 다중 선택 가능할 때
	JRadioButton M,W;	   // 반드시 하나만 선택 가능할 때
	JTextField tf;			//한줄 입력
	JTextArea ta;			//여러줄 입력
	
	//객체 선언
	ATest(){
		f = new JFrame("나의 첫창");
		btn = new JButton("클릭");
		bCancel = new JButton("취소");
		Java = new Checkbox("java");
		Oracle = new Checkbox("oracle");
		M = new JRadioButton("남자");
		W = new JRadioButton("여자");
		ButtonGroup group = new ButtonGroup(); // 지역변수(멤버변수로 만들필요없음)
		group.add(M);
		group.add(W);
		tf = new JTextField(20);
		ta = new JTextArea(40, 20);
		
	}
	
	void addLayout() {
		//f.setLayout(new FlowLayout());	//한 줄로 배치
		//f.setLayout(new GridLayout(3,3));	//행과 열에 맞춰 배치
		f.setLayout(new BorderLayout()); 	//동, 서, 남, 북 가운데 배치 / 하나씩만 붙을 수 있음
		
		//붙이기 작업
		f.add(btn       , BorderLayout.NORTH);
		f.add(bCancel   , BorderLayout.SOUTH);
		//f.add(Java);
		//f.add(Oracle);
			JPanel pEast = new JPanel();
			pEast.add(M);
			pEast.add(W);
		f.add(pEast       , BorderLayout.EAST);
		
		
		f.add(new JLabel("입력하세요"), BorderLayout.WEST);
		//f.add(tf     , BorderLayout.EAST);
		f.add(ta        , BorderLayout.CENTER);
		
		
		//화면 출력
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//실행했을 때 X를 누르면 실행종료가 되는ㄴ 함수 
	}
	
	public static void main(String[] args) {
		ATest a= new ATest();
		a.addLayout();
	}

}
