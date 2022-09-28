package kiosk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelB2 extends JPanel{
	
	//멤버변수 객체생성
	
	JButton aBtn = new JButton("떡볶이");
	JButton bBtn = new JButton("모짜감자");
	JButton cBtn = new JButton("치즈볼");
	JButton dBtn = new JButton("파인샤벳");
	
	MainTest parent;	//멤버변수 선언
	
	public PanelB2 (MainTest mainTest) {
		
		parent = mainTest;  //주소값 받아줌
		
		addLayout();
		eventProc();
	}
	
	void addLayout() {
		add(aBtn);
		add(bBtn);
		add(cBtn);
		add(dBtn);
		
	}
	
	void eventProc() {
		aBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	}
}
