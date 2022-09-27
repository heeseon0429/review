package d_calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalTest {

	// 1. 멤버변수 선언
	JFrame f;
	JTextField tf;
	JButton []bNum = new JButton[10]; 	// 0~9 숫자 표현할 버튼
	JButton []bOp = new JButton[4];		//+, -, *, / 연산자를 표현할 버튼들
	JButton bEqual;

	//값 계산해주는 변수 선언(한 자리)
	int first, second;	
	String op;

	// 2. 객체 생성
	CalTest(){

		f      = new JFrame("계산기");	//프레임 생성
		tf     = new JTextField(15);	//TextField 생성
		bEqual = new JButton("=");		//bEqual 생성		
		bNum   = new JButton[10];
		for(int i = 0; i < bNum.length; i++ ) {	  		 //for 문을 사용해서 bNum 배열
			bNum[i] = new JButton(String.valueOf(i));	 //bNum 생성 
		}
		bOp[0] = new JButton("+");  // "+" 연산자 생성
		bOp[1] = new JButton("-");  // "-" 연산자 생성
		bOp[2] = new JButton("*");  // "*" 연산자 생성
		bOp[3] = new JButton("/");  // "/" 연산자 생성

	}// end of CalTest()

	//3. 화면 구성 및 화면출력
	void addLayout() {

		f.setLayout(new BorderLayout());
		JPanel pCenter = new JPanel(new GridLayout(5,3));		//Panel 생성
		//pCenter.setPreferredSize(new Dimension(250,100));		//화면 크기 설정

		for(int i = 1; i < bNum.length; i++) {					//bNum for문 
			pCenter.add(bNum[i]);
		}

		pCenter.add(bOp[0]);	//순서대로 화면 출력해주기
		pCenter.add(bNum[0]);	
		pCenter.add(bEqual);	
		pCenter.add(bOp[1]);
		pCenter.add(bOp[2]);	
		pCenter.add(bOp[3]);	

		f.add(tf, BorderLayout.NORTH);							//입력창
		f.add(pCenter, BorderLayout.CENTER);

		//화면 출력
		f.setBounds(100,100,250,250);							//화면 크기
		f.setVisible(true);										//화면 출력
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//실행했을 때 X를 누르면 실행취소
	} //end of addLayout()

	//4. 이벤트 처리
	void eventProc() {

		//숫자 버튼이 눌렸을 때
		for(int i=0; i<bNum.length; i++) {
			bNum[i].addActionListener(new ActionListener(){  
				@Override
				public void actionPerformed(ActionEvent e) {
					//이벤트가 발생한 컴포넌트의 참조를 얻어옴
					JButton eBtn = (JButton)e.getSource();			//getSource를 eBtn에 값 지정
					String su = tf.getText()+eBtn.getText();		//eBtn을 변수 su //tf.getText()+ : 두자리 계산값
					tf.setText(su);							 		//su값을 넣어줌
				}  //end of actionPerformed 	
			});	   //end of addActionListener
		} 		   //end of for

		//연산자 버튼이 눌렸을 때
		for(int i=0; i<bOp.length; i++) {
			bOp[i].addActionListener(new ActionListener(){  
				@Override
				public void actionPerformed(ActionEvent e) {
					//이벤트가 발생한 컴포넌트의 참조를 얻어옴
					JButton eBtn = (JButton)e.getSource();
					op = eBtn.getText();					//연산자
					first = Integer.parseInt(tf.getText());	//int를 String으로 바꿔주기위해 Integer.parseInt를 사용함.
					tf.setText(null);						//두자리 계산값
				} 	//end of actionPerformed
			});     //end of addActionListener
		}           //end of for

		//= 버튼이 눌렸을 때
		bEqual.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				second = Integer.parseInt(tf.getText());
				int result = 0;								//result값 저장
				switch(op) {								
				case "+" : result = first + second; break;  //switch 구문 적어주기
				case "-" : result = first - second; break;
				case "*" : result = first * second; break;
				case "/" : result = first / second; break;
				}
				tf.setText(String.valueOf(result)); 
			} 	//end of actionPerformed
		});  	//end of addActionListener
	}			//end of eventProc()

	public static void main(String[] args) {
		CalTest cal = new CalTest();
		cal.addLayout();
		cal.eventProc();
	}

}
