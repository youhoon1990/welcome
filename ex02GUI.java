package d1126GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex02GUI {

	private JFrame frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex02GUI window = new ex02GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ex02GUI() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_title = new JLabel("\uC774\uB3D9\uD558\uB294 GUI");
		lbl_title.setBounds(32, 66, 322, 89);
		frame.getContentPane().add(lbl_title);
		
		JButton btn_move = new JButton("\uC21C\uAC04\uC774\uB3D9!");
		btn_move.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//â�̵��ϱ�
				//ex01GUI Ŭ������ ������ �ִ� ��� �߿� main �޼ҵ带 ȣ��
				ex01GUI.main(null);
				
				//���� Ŭ����(â)�� �ݴ� ���
				frame.dispose();
				//Design���� �ȿ������!! source �ǿ��� ������ �� ���� �ּ�ó���ϱ�
			}
		});
		btn_move.setBounds(12, 259, 342, 97);
		frame.getContentPane().add(btn_move);
	}
}
