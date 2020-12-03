package d1126GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex01GUI {
	

	private JFrame frame;
	private JTextField textField;
	JLabel lbl_title;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			// >>>마우스 클릭과 같은 특정 event가 발생했을 때 이벤트를 처리해주는 객체(thread)를 생성 
			public void run() {
				try {
					//ex01gui는 우리가 만든 클래스 설계도 이름, 얘를 window라고 하는 변수명으로 사용하겠다
					ex01GUI window = new ex01GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});  //어나니머스
	}


	public ex01GUI() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame(); 
		//frame 생성
		frame.setBounds(100, 100, 450, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);//null은 엡솔루트 레이아웃 의미
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 410, 479);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lbl_title = new JLabel("GUI \uD14C\uC2A4\uD2B8");
		lbl_title.setBackground(Color.CYAN);
		lbl_title.setForeground(Color.BLUE);
		lbl_title.setBounds(23, 20, 182, 72);
		panel.add(lbl_title);
		
		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setBounds(79, 111, 267, 69);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lbl_text = new JLabel("");
		lbl_text.setBounds(23, 323, 182, 72);
		panel.add(lbl_text);
		
		JButton btn_enter = new JButton("\uD074\uB9AD!");
		btn_enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Event에 관련한 특정행위는 이 내부에 작성한다!
				//textField -> Components에서 텍스트를 가지고 오는 작업!
				//textField에서 글자를 가져오는 메소드
				
				String text = textField.getText();
				System.out.println(text);
				textField.setText("");
				// 투명 라벨 lbl_text textField에서 가지고 온 글자를 넣기!
				lbl_text.setText(text);
			}
		});
		btn_enter.setBackground(Color.RED);
		btn_enter.setForeground(Color.DARK_GRAY);
		btn_enter.setToolTipText("\uD074\uB9AD");
		btn_enter.setBounds(90, 214, 256, 87);
		panel.add(btn_enter);
	}
}
