package b_info;

 import java.awt.*;
 import javax.swing.*;

 public class InfoView {

	//1. 멤버변수선언
	JFrame f;
	JTextField tfName, tfId, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	
	//2. 멤버변수 객체생성
	InfoView(){
		//프레임 설정
		f = new JFrame("DBTest"); 
		//좌측 설정
		tfName = new JTextField(10);
		tfId = new JTextField(10);
		tfTel = new JTextField(10);
		tfGender = new JTextField(10);
		tfAge = new JTextField(10);
		tfHome = new JTextField(10);
		//여러줄 입력
		ta = new JTextArea(40,20);
		//하단 설정
		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");
		
	}
	
	//3. 화면구성하고 출력
	/*
	 * 전체 프레임 BorderLayout 지정 
	 * 		- WEST	 : JPanel 붙이기(GridLAyout(6,2))	//6행 2열
	 * 		- CENTER : 텍스트에어리어
	 * 		- SOUTH  : JPanel 붙이기 (GridLayout(1,6))//1행 6열
	 */
	public void addLayout() {

		//붙이기 작업
		
		//좌측 설정
		JPanel pWest = new JPanel();				//JPanel 객체 생성
		pWest.setLayout(new GridLayout(6,2));		//행과 열 지정
		f.add(pWest, BorderLayout.WEST);			//어느쪽에 만들건지
		pWest.add(tfName.add(new JLabel("Name",JLabel.CENTER)));
		pWest.add(tfName);
		pWest.add(tfId.add(new JLabel("Id", JLabel.CENTER)));
		pWest.add(tfId);
		pWest.add(tfTel.add(new JLabel("Tel", JLabel.CENTER)));
		pWest.add(tfTel);
		pWest.add(tfGender.add(new JLabel("Gender", JLabel.CENTER)));
		pWest.add(tfGender);
		pWest.add(tfAge.add(new JLabel("Age", JLabel.CENTER)));
		pWest.add(tfAge);
		pWest.add(tfHome.add(new JLabel("Home", JLabel.CENTER)));
		pWest.add(tfHome);
		
		//하단 설정
		JPanel pSouth = new JPanel();
		pSouth.setLayout(new GridLayout(1,6));
		f.add(pSouth, BorderLayout.SOUTH);
		pSouth.add(bAdd);
		pSouth.add(bShow);
		pSouth.add(bSearch);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bExit);
		
		//입력값 설정
		f.add(ta        , BorderLayout.CENTER);
		
		//화면 출력
		f.setBounds(100,100,500,350);	//화면 크기
		f.setVisible(true);				//화면 출력
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//실행했을 때 X를 누르면 실행취소
		
	}
	public static void main(String[] args) {

		InfoView info = new InfoView();
		info.addLayout();
		
	}

}
