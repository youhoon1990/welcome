package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class page01 {

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
					page01 window = new page01();
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
	public page01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 857, 766);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setBounds(342, 410, 170, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.setBounds(342, 496, 170, 61);
		frame.getContentPane().add(btnNewButton_1);
		
		text_id = new JTextField();
		text_id.setBounds(306, 241, 243, 47);
		frame.getContentPane().add(text_id);
		text_id.setColumns(10);
		
		text_pw = new JTextField();
		text_pw.setColumns(10);
		text_pw.setBounds(306, 325, 243, 47);
		frame.getContentPane().add(text_pw);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setBounds(176, 270, 72, 31);
		frame.getContentPane().add(lbl_id);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(176, 354, 72, 31);
		frame.getContentPane().add(lblPw);

		JLabel lbl_image = new JLabel(new ImageIcon("C:\\Users\\smhrd\\Desktop\\JAVA\\1128GUI\\bin\\lion.jpg"));
		lbl_image.setBounds(188, 42, 546, 175);
		frame.getContentPane().add(lbl_image);
		
		JLabel lbl_image2 = new JLabel("New label");
		lbl_image2.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\JAVA\\1128GUI\\bin\\lion.jpg"));
		lbl_image2.setBounds(58, 579, 154, 138);
		frame.getContentPane().add(lbl_image2);
		
		JLabel lbl_image3 = new JLabel("New label");
		lbl_image3.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\JAVA\\1128GUI\\bin\\lion.jpg"));
		lbl_image3.setBounds(564, 564, 154, 124);
		frame.getContentPane().add(lbl_image3);
	}
}
