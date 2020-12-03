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
		lbl_title.setFont(new Font("����", Font.PLAIN, 20));
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
				//textfield�� �ִ� ���� ������ �ͼ� ������ ����
				//id, pw, name >������
				// age >������ ����
				String id = text_id.getText();
				String pw = text_pw.getText();
				String name = text_name.getText();
				int age = Integer.parseInt(text_age.getText());
				
				//InsertVO vo = new InsertVO(id, pw, name, age);
				// DAOŬ������ ������ �ִ� INSERT��������
				// 1. DAOŬ���� �ҷ�����
				DAO dao = new DAO();
				int result =  dao.insert(new InsertVO(id, pw, name, age));
				
				if(result>0) {
					//�˾�â ����
					JOptionPane.showInternalMessageDialog(null, "ȸ������ ����@@", "ȸ������ ����â", JOptionPane.INFORMATION_MESSAGE);
					//showmessageDialog(�θ�������Ʈ, ����� �޼���, ����, ������)
					
				}else{
					System.out.println("����");//����
				}
				//
				
				
				//System.out.println(id+pw+name+age);
				//login���� �̵�
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
