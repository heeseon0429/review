package kiosk;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainTest {

	JFrame f;
	JButton btn, aBtn, bBtn, cBtn, dBtn;
	JLabel lab;

	Panel panelA;
	Panel panelB;
	Panel panelC;
	Panel panelD;

	MainTest(){

		f = new JFrame("Kiosk 주문창");
		aBtn = new JButton("떡볶이");
		bBtn = new JButton("모짜감자");
		cBtn = new JButton("치즈볼");
		dBtn = new JButton("파인샤벳");
		panelA = new Panel();
		panelB = new Panel();
		panelC = new Panel();
		panelD = new Panel();

	} // end of MainTest

	void addLayout(){

		JPanel pCenter = new JPanel(new GridLayout(2,2));
		//f.setLayout(new GridLayout(2,2));
		
		pCenter.add(aBtn);
		pCenter.add(bBtn);
		pCenter.add(cBtn);
		pCenter.add(dBtn);
		
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("메인 메뉴", panelA);
		tab.addTab("사이드 메뉴", panelB);
		tab.addTab("음료", panelC);
		tab.addTab("주류", panelD);

		f.add(tab, BorderLayout.CENTER);
		
		f.add(pCenter);
		f.setBounds(100, 100, 500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	} // addLayout()
	
	void eventProc() {

	} // end of eventProc()

	public static void main(String[] args) {

		MainTest test = new MainTest();
		test.addLayout();
		test.eventProc();
	} // end of main
	
}


	
