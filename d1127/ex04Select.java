package d1127;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.DAO;
import model.InsertVO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex04Select {

	private JFrame frame;
	private JTable table;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex04Select window = new ex04Select();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ex04Select() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 452, 351);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, "name_348894677338900");
		
		table = new JTable( );
		scrollPane.setViewportView(table);
		
		JButton btn_select = new JButton("\uAC00\uC838\uC624\uAE30");
		btn_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_select.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//dao에서 셀렉 기능 만들어서 smartmember 안에있는 모든 값 가지고 오기
				DAO dao = new DAO();
				ArrayList<InsertVO> list =  dao.allSelect();
				
				//list 안에 있는 데이터 중에 첫번째 데이터의 이름만 출력해
				System.out.println(list.get(0).getName());
				//Q1. j테이블ㅇ란에 넣을 이차원배열 생성해봐
				
				String[] column = {"아이디", "비밀번호", "이름", "나이"};
				Object[][] data = new Object[list.size()][column.length];
					//배열생성
					//아래에 데이터 담아보시오
					
					

					for(int i=0; i<list.size(); i++) {
						data[i][0] = list.get(i).getId();
						data[i][1] = list.get(i).getPw();
						data[i][2] = list.get(i).getName();
						data[i][3] = list.get(i).getAge();
					}
					
					//이제 테이블에 데이터추가
					table.setModel(new DefaultTableModel(data, column));
						
								
					
				
				
			}
		});
		btn_select.setBounds(67, 371, 355, 58);
		frame.getContentPane().add(btn_select);
		

	}
}
