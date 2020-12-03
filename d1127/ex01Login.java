package d1127;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import DAO.DAO;
import model.InsertVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex01Login {
	// 오늘 jdbc랑 GUI랑 연동함
	// main - invoke(이벤트 처리 객체 생성하는ㄱ ㅓㅅ run메서드 실행 어나니메서드) -아래로 쭉갓다가 돌아와사ㅓ ex01Login
	// window = new ex01Login();실행

	private JFrame frame;
	private JTextField text_id;
	private JTextField text_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex01Login window = new ex01Login();
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
	public ex01Login() {
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

		JLabel lbl_title = new JLabel("\uB85C\uADF8\uC778 \uC2DC\uC2A4\uD15C");
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setFont(new Font("굴림", Font.PLAIN, 20));
		lbl_title.setBounds(25, 32, 397, 94);
		frame.getContentPane().add(lbl_title);

		text_id = new JTextField();
		text_id.setBounds(105, 153, 242, 38);
		frame.getContentPane().add(text_id);
		text_id.setColumns(10);

		text_pw = new JTextField();
		text_pw.setColumns(10);
		text_pw.setBounds(105, 201, 242, 38);
		frame.getContentPane().add(text_pw);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//1. txt_id , txt_pw에 있는 텍스트가지고오기
				String id = text_id.getText();
				String pw = text_pw.getText();
				//2. 이 값들을 InsertVO 묶어주기
				InsertVO vo = new InsertVO(id, pw);
				//3. DAO생성
				
				DAO dao = new DAO();
				
				//4. dao 안에 login기능 수행
				String name = dao.login(vo);
				//로그인 성공시 ex03MyPage로 이동
				if(name != null) {
					ex03MyPage ex03mapage = new ex03MyPage(name);
					frame.dispose();
					//성공시 테이블 선택 화면으로?
				}else {
					JOptionPane.showInternalMessageDialog(null, "로그인 실패", "알림", JOptionPane.INFORMATION_MESSAGE);
				}

				// ex01Login.main(null);

				// 현재 창 닫기
			}
		});
		btn_login.setBounds(123, 295, 130, 38);
		frame.getContentPane().add(btn_login);

		JButton btn_insert = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_insert.addMouseListener(new MouseAdapter() {
			@Override

			public void mouseClicked(MouseEvent e) {
				ex02insert.main(null);

				// 현재 창 닫기
				frame.dispose();
			}
		});
		btn_insert.setBounds(123, 358, 130, 38);
		frame.getContentPane().add(btn_insert);

		JButton btn_delete = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		btn_delete.setBounds(123, 430, 130, 38);
		frame.getContentPane().add(btn_delete);

		JLabel lbl_id = new JLabel("id : ");
		lbl_id.setFont(new Font("굴림", Font.PLAIN, 18));
		lbl_id.setBounds(9, 164, 57, 15);
		frame.getContentPane().add(lbl_id);

		JLabel lbl_pw = new JLabel("pw :");
		lbl_pw.setFont(new Font("굴림", Font.PLAIN, 18));
		lbl_pw.setBounds(9, 212, 57, 15);
		frame.getContentPane().add(lbl_pw);
	}
}
