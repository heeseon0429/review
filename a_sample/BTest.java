package a_sample;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BTest extends JFrame {

	JButton btn;
	
	BTest(){
		super("나의 두번째창"); //부모를 가져와야함
		btn = new JButton("확인2");
	}
	void addLayout() {
		
		add(btn);//
		
		setBounds(100,100,500,350);	//크기 지정
		setVisible(true);			//화면 출력
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//
		
	}
	public static void main(String[] args) {

		BTest b = new BTest();
		b.addLayout();
	}

}
