package c_sample;

import java.awt.*;			//Class만 가능함
import java.awt.event.*;	//다른 패키지임

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * 화면(JFrame)에 '확인' 버튼 하나 출력
 */

public class EventTest2 {
	JFrame f;
	JButton btn;
	
	EventTest2(){
		f = new JFrame( );
		btn = new JButton("확인");
		
		// (2) 핸들러 객체 생성
		// (3) 이벤트 발생할 컴포넌트와 연결
		btn.addActionListener(new MyHandler());		// (2)번과 (3)번 함축
	}
	// (1) 이벤트 핸들러 만들기
	//       헨들러 - 이벤트 처리 클래스
	class MyHandler implements ActionListener{  //Class안에 Class 들어갈 수 있음. inner Class
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"이벤트발생2");
		} 	
	}
	
		//확인 버튼 출력
	public void addLayout(){	
		f.setLayout(new FlowLayout());
		f.add(btn);
		f.setBounds(100,100,500,350);	//화면 크기						
		f.setVisible(true);				//화면 출력		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public static void main(String[] args) {
		EventTest2 event = new EventTest2();
		event.addLayout();
	}

}
