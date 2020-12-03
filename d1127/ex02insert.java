package d1127;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DAO.DAO;
import model.InsertVO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex02insert {

	private JFrame frame;
	private JTextField text_id;
	private JTextField text_pw;
	private JTextField text_name;
	private JTextField text_age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex02insert window = new ex02insert();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ex02insert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_title = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setFont(new Font("굴림", Font.PLAIN, 20));
		lbl_title.setBounds(12, 24, 385, 76);
		frame.getContentPane().add(lbl_title);
		
		text_id = new JTextField();
		text_id.setBounds(130, 135, 256, 21);
		frame.getContentPane().add(text_id);
		text_id.setColumns(10);
		
		text_pw = new JTextField();
		text_pw.setColumns(10);
		text_pw.setBounds(130, 193, 256, 21);
		frame.getContentPane().add(text_pw);
		
		text_name = new JTextField();
		text_name.setColumns(10);
		text_name.setBounds(130, 259, 256, 21);
		frame.getContentPane().add(text_name);
		
		text_age = new JTextField();
		text_age.setColumns(10);
		text_age.setBounds(130, 337, 256, 21);
		frame.getContentPane().add(text_age);
		
		JButton btn_insert = new JButton("\uD68C\uC6D0\uAC00\uC785\uD558\uAE30");
		btn_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_insert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//textfield에 있는 값을 가지고 와서 변수에 저장
				//id, pw, name >무낮열
				// age >정수형 저장
				String id = text_id.getText();
				String pw = text_pw.getText();
				String name = text_name.getText();
				int age = Integer.parseInt(text_age.getText());
				
				//InsertVO vo = new InsertVO(id, pw, name, age);
				// DAO클래스가 가지고 있는 INSERT기능을사용
				// 1. DAO클래스 불러오기
				DAO dao = new DAO();
				int result =  dao.insert(new InsertVO(id, pw, name, age));
				
				if(result>0) {
					//팝업창 띄우기
					JOptionPane.showInternalMessageDialog(null, "회원가입 성공@@", "회원가입 성공창", JOptionPane.INFORMATION_MESSAGE);
					//showmessageDialog(부모컴포넌트, 띄워줄 메세지, 제목, 아이콘)
					
				}else{
					System.out.println("실패");//실패
				}
				//
				
				
				//System.out.println(id+pw+name+age);
				//login으로 이동
				ex01Login.main(null);
				frame.dispose();
			}
		});
		btn_insert.setBounds(156, 417, 165, 23);
		frame.getContentPane().add(btn_insert);
		
		JLabel lbl_id = new JLabel("id");
		lbl_id.setBounds(44, 138, 57, 15);
		frame.getContentPane().add(lbl_id);
		
		JLabel lbl_pw = new JLabel("pw");
		lbl_pw.setBounds(44, 196, 57, 15);
		frame.getContentPane().add(lbl_pw);
		
		JLabel lbl_name = new JLabel("name");
		lbl_name.setBounds(44, 262, 57, 15);
		frame.getContentPane().add(lbl_name);
		
		JLabel lbl_age = new JLabel("age");
		lbl_age.setBounds(44, 340, 57, 15);
		frame.getContentPane().add(lbl_age);
	}
}
