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
			// >>>���콺 Ŭ���� ���� Ư�� event�� �߻����� �� �̺�Ʈ�� ó�����ִ� ��ü(thread)�� ���� 
			public void run() {
				try {
					//ex01gui�� �츮�� ���� Ŭ���� ���赵 �̸�, �긦 window��� �ϴ� ���������� ����ϰڴ�
					ex01GUI window = new ex01GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});  //��ϸӽ�
	}


	public ex01GUI() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame(); 
		//frame ����
		frame.setBounds(100, 100, 450, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);//null�� ���ַ�Ʈ ���̾ƿ� �ǹ�
		
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
				
				//Event�� ������ Ư�������� �� ���ο� �ۼ��Ѵ�!
				//textField -> Components���� �ؽ�Ʈ�� ������ ���� �۾�!
				//textField���� ���ڸ� �������� �޼ҵ�
				
				String text = textField.getText();
				System.out.println(text);
				textField.setText("");
				// ���� �� lbl_text textField���� ������ �� ���ڸ� �ֱ�!
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
