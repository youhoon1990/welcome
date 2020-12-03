package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Label;
import javax.swing.JTextField;

import model.InsertVO;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class page02 {

	private JFrame frame;
	private JTextField text_id;
	private JTextField text_pw;
	private JTextField text_name;
	private JTextField text_tel;
	private JTextField text_birth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page02 window = new page02();
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
	public page02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String url = getClass().getResource("")+ "lion.png";
		Image image = new ImageIcon("C:\\Users\\smhrd\\Desktop\\JAVA\\1128GUI\\bin\\lion.jpg").getImage();
		//크기를 조절
		image = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 533, 573);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_gaib = new JLabel("New label");
		lbl_gaib.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\\uAC00\uC785.PNG"));
		lbl_gaib.setBounds(124, 10, 248, 46);
		panel.add(lbl_gaib);
		
		text_id = new JTextField();
		text_id.setBounds(124, 121, 287, 21);
		panel.add(text_id);
		text_id.setColumns(10);
		
		text_pw = new JTextField();
		text_pw.setColumns(10);
		text_pw.setBounds(124, 162, 287, 21);
		panel.add(text_pw);
		
		text_name = new JTextField();
		text_name.setColumns(10);
		text_name.setBounds(124, 211, 287, 21);
		panel.add(text_name);
		
		text_tel = new JTextField();
		text_tel.setColumns(10);
		text_tel.setBounds(124, 259, 287, 21);
		panel.add(text_tel);
		
		text_birth = new JTextField();
		text_birth.setColumns(10);
		text_birth.setBounds(124, 314, 287, 21);
		panel.add(text_birth);
		
		JButton btnNewButton = new JButton("\uAC00\uC785\uD558\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = text_id.getText();
				String pw = text_pw.getText();
				String name = text_name.getText();
				int age = Integer.parseInt(text_birth.getText());
				DAO2 dao = new DAO2();
				int result = dao.insert(new InsertVO2(id, pw, name, age));
				
			}
		});
		btnNewButton.setBounds(211, 385, 97, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("  ID");
		lblNewLabel.setBounds(12, 127, 100, 15);
		panel.add(lblNewLabel);
		
		JLabel lblPw = new JLabel("  PW");
		lblPw.setBounds(12, 165, 100, 15);
		panel.add(lblPw);
		
		JLabel lblNewLabel_2 = new JLabel("  \uC774\uB984");
		lblNewLabel_2.setBounds(12, 214, 100, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("  \uC5F0\uB77D\uCC98");
		lblNewLabel_3.setBounds(12, 262, 100, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("  \uC0DD\uC77C");
		lblNewLabel_4.setBounds(12, 317, 100, 15);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("\uCC98\uC74C\uC73C\uB85C");
		btnNewButton_1.setBounds(211, 441, 97, 23);
		panel.add(btnNewButton_1);
	}
}
