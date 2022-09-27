package b_info;

 import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
		tfName	 = new JTextField(10);
		tfId 	 = new JTextField(10);
		tfTel 	 = new JTextField(10);
		tfGender = new JTextField(10);
		tfAge 	 = new JTextField(10);
		tfHome 	 = new JTextField(10);
		
		//center 입력창
		ta = new JTextArea(40,20);

		//하단 설정
		bAdd    = new JButton("Add"); 	   		//추가버튼
		bShow   = new JButton("Show");			//전체보기버튼
		bSearch = new JButton("Search");		//검색버튼
		bDelete = new JButton("Delete"); 		//삭제버튼
		bCancel = new JButton("Cancel");		//취소버튼
		bExit   = new JButton("Exit (alt + x)", new ImageIcon("src\\b_info\\imgs\\1.PNG")); //단축키 생성
			bExit.setHorizontalTextPosition(JButton.CENTER);  				   //수평, 이미지
			bExit.setVerticalTextPosition(JButton.BOTTOM);	   				   //수직, 텍스트
			bExit.setRolloverIcon(new ImageIcon("src\\b_info\\imgs\\2.PNG"));  //마우스가 올라가면 이미지 변경
			bExit.setPressedIcon(new ImageIcon("src\\b_info\\imgs\\3.PNG"));   //클릭했을 때 이미지 변경
			bExit.setToolTipText("프로그램을 종료합니다.");						   //말풍선(마우스 커서 올렸을 때)
			bExit.setMnemonic('x'); 										   //단축키 생성(art + 'X')
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
		JPanel pWest = new JPanel();						//JPanel 객체 생성
		pWest.setLayout(new GridLayout(6,2));				//행과 열 지정
		f.add(pWest, BorderLayout.WEST);					//어느쪽에 만들건지
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
		f.add(ta, BorderLayout.CENTER);
		
		//화면 출력
		f.setBounds(100,100,500,350);							//화면 크기
		f.setVisible(true);										//화면 출력
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//실행했을 때 X를 누르면 실행취소
		
		}
	
	public void eventProc() {			//
		//'ADD'버튼이 눌렸을 때	
		bAdd.addActionListener(new ActionListener(){  
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"ADD 버튼 클릭");
			} 	
		});	
			bShow.addActionListener(new ActionListener(){  
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"Show 버튼 클릭");
			} 	
		});	
			bSearch.addActionListener(new ActionListener(){  
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"Search 버튼 클릭");
			} 	
		});	
			bDelete.addActionListener(new ActionListener(){  
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"Delete 버튼 클릭");
			} 	
		});	
			bCancel.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Cancel 버튼 클릭");
		} 	
	});	
			bExit.addActionListener(new ActionListener(){  
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"Exit 버튼 클릭");
			} 	
		});	
			//주민번호 입력창에서 엔터 쳤을 때
			tfId.addActionListener(new ActionListener(){  
				@Override
				public void actionPerformed(ActionEvent e) {
					String jumin = tfId.getText();
					if(jumin.length() < 14 ) {
					JOptionPane.showMessageDialog(null, "- 포함한 14자를 맞춰주세요");
					return;
					} //end of if
					
					// (1) 주민번호의 7번째 문자로 성별을 구하여 성별창에 출력
					char sung = jumin.charAt(7);    //주민번호 7번째 자릿수가 성별을 뜻함.
					
					if(sung == '1' || sung =='3' || sung =='9') {		//만약 7번째 자리에 1,3,9가 입력되면
						tfGender.setText("남성");							//tfGender에 Text는 남성이라고 set
					}else if(sung == '2' || sung =='4' ||sung =='0'){	//만약 7번째 자리에 2,4,0가 입력되면
					tfGender.setText("여성");								//tfGender에 Text는 여성이라고 set
					}
					
					// (2) 주민번호의 8번째 문자로 출신지를 구하여 출신지창에 출력
					char chull = jumin.charAt(8);						//주민번호 8번째 자릿수가 출신지를 뜻함.
					String home = null;
					switch(chull) {										//switch  구문
					case '0': tfHome.setText("서울");  break;
					case '1': tfHome.setText("인천/부산"); break;
					case '2': tfHome.setText("경기");  break;
					case '9': tfHome.setText("제주");  break;
					}
					
					// (3) 주민번호에서 년도에 의해 나이를 구해서 나이창에 출력 
					String nai = jumin.substring(0,2);		//나이는 주민번호 0,1번째
					int sunai = Integer.parseInt(nai);		
					int age = 0;
					
					Calendar c =  Calendar.getInstance();
					int year = c.get(Calendar.YEAR);

					age = year -(1900 + sunai);
					tfAge.setText(String.valueOf(age));		//int -> String 형 변환
					}  //end of actiongPerformed
		});			   //end of addActionListener
			
			//주민번호 입력창에서 엔터 쳤을 때
			tfId.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					getJuminInfo();
				}
			});
			
			//주민번호 입력창에서 포커스 이벤트 발생했을 때
			tfId.addFocusListener(new FocusListener(){		
				@Override
				public void focusGained(FocusEvent e) {
				}
				@Override
				public void focusLost(FocusEvent e) {
					getJuminInfo();
				}
			
			});//end of addFocusListener
			}//end of eventProc()
			void getJuminInfo() {
				
			}
	
		public static void main(String[] args) {

		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();			
		
	}

}
