package d1127;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import DAO.DAO;
import model.InsertVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Menu4 {
	

	private JFrame frame;
	private JPanel panel_3, panel_4, panel_2;
	private String url = getClass().getResource("").getPath(); //현재 내 클래스 파일이 있는 위치를 가져오는 방법
	private JTable table;
    Vector<String> row;
    DefaultTableModel DFMO;
    Vector<Vector> rowData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
//			Vector<String> userColumn = new Vector<String>();
//			DefaultTableModel model;
//			Vector<String> userRow;
//
//			
//			userRow = new Vector<String>(); // 내용추가 (행추가)
//			userRow.addElement("홍길동");
//			userRow.addElement("의적");
//			model.addRow(userRow);
			
			public void run() {
				try {
					Menu4 window = new Menu4();
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
	public Menu4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 1037, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 1009, 636);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 32));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(188, 10, 616, 98);
		panel.add(lblNewLabel);
		
		JButton btn1 = new JButton("\uBA54\uC778");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		btn1.setBounds(12, 124, 115, 58);
		panel.add(btn1);
		
		JButton btn2 = new JButton("\uC0AC\uC774\uB4DC");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false); // 안보이게 만들어주기
				panel_4.setVisible(false);
				panel_3.setVisible(true); //버튼 클릭시 패널이 보이게 만들어주기
			}
		});
		btn2.setBounds(12, 202, 115, 58);
		panel.add(btn2);
		
		JButton btn3 = new JButton("\uC74C\uB8CC");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(true);
			}
		});
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 10, 10);
		panel.add(panel_6);
		btn3.setBounds(12, 288, 115, 58);
		panel.add(btn3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(188, 105, 500, 498);
		panel.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		panel_2 = new JPanel();
		panel_1.add(panel_2, "name_149909834357300");
		
		JButton button = new JButton("\uAC00\uC9C0\uD30C\uC2A4\uD0C0 15000");
		button.setBounds(37, 403, 158, 30);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.setLayout(null);
		panel_2.add(button);
		
		
		
		
		Image image1 = new ImageIcon(url + "image\\pasta2.jpg").getImage();
		JLabel lbl_pasta2 = new JLabel();
		lbl_pasta2.setIcon(new ImageIcon(image1.getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
		lbl_pasta2.setBounds(52, 263, 130, 130);
		panel_2.add(lbl_pasta2);
		
		Image image2 = new ImageIcon(url + "image\\pizza.png").getImage();
		JLabel lbl_pizza = new JLabel();
		lbl_pizza.setIcon(new ImageIcon(image2.getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
		lbl_pizza.setBounds(279, 267, 130, 126);
		panel_2.add(lbl_pizza);
		
		JButton button_1 = new JButton("\uC2A4\uD14C\uC774\uD06C 35000");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				///
			}
		});
		button_1.setBounds(37, 189, 158, 30);
		panel_2.add(button_1);
		
		Image image3 = new ImageIcon(url + "image\\pasta.jpg").getImage();
		JLabel lbl_pasta = new JLabel();
		lbl_pasta.setIcon(new ImageIcon(image3.getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
		lbl_pasta.setBounds(279, 53, 130, 126);
		panel_2.add(lbl_pasta);
		
		JButton button_1_1 = new JButton("\uC624\uC77C\uD30C\uC2A4\uD0C0 18000");
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1_1.setBounds(265, 189, 158, 30);
		panel_2.add(button_1_1);
		
		Image image4 = new ImageIcon(url + "image\\steak.jpg").getImage();
		JLabel lbl_steak = new JLabel();
		lbl_steak.setIcon(new ImageIcon(image4.getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
		lbl_steak.setBounds(52, 53, 130, 130);
		panel_2.add(lbl_steak);
		
		JButton button_2 = new JButton("\uD53C\uC790 20000");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(265, 403, 158, 30);
		panel_2.add(button_2);
		
		panel_3 = new JPanel();
		panel_1.add(panel_3, "name_149911297723300");
		panel_3.setVisible(false);
		panel_3.setLayout(null);
		
		JButton button_3 = new JButton("\uD06C\uB9BC\uCE58\uC988\uC0D0\uB7EC\uB4DC 10000");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(67, 188, 158, 30);
		panel_3.add(button_3);
		
		JButton button_3_1 = new JButton("\uAC10\uC790\uD280\uAE40 6000");
		button_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3_1.setBounds(292, 188, 158, 30);
		panel_3.add(button_3_1);
		
		JButton button_3_2 = new JButton("\uCF54\uCF54\uB11B\uC26C\uB9BC\uD504 10000");
		button_3_2.setBounds(67, 398, 158, 30);
		panel_3.add(button_3_2);
		
		JButton button_3_3 = new JButton("");
		button_3_3.setBounds(292, 398, 158, 30);
		panel_3.add(button_3_3);
		
		
		
		Image image5 = new ImageIcon(url + "image\\salad.jpg").getImage();
		JLabel lbl_salad = new JLabel();
		lbl_salad.setIcon(new ImageIcon(image5.getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
		lbl_salad.setBounds(75, 48, 130, 126);
		panel_3.add(lbl_salad);
		
		
		Image image6 = new ImageIcon(url + "image\\frenchfries.jpg").getImage();
		JLabel lbl_frenchfries = new JLabel();
		lbl_frenchfries.setIcon(new ImageIcon(image6.getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
		lbl_frenchfries.setBounds(302, 48, 130, 130);
		panel_3.add(lbl_frenchfries);
		
		Image image7 = new ImageIcon(url + "image\\coconutshrimp.JFIF").getImage();
		JLabel lbl_coconutshrimp = new JLabel();
		lbl_coconutshrimp.setIcon(new ImageIcon(image7.getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
		lbl_coconutshrimp.setBounds(75, 244, 130, 130);
		panel_3.add(lbl_coconutshrimp);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(53, 48, 130, 109);
		panel_3.add(lblNewLabel_1);
		
		panel_4 = new JPanel();
		panel_1.add(panel_4, "name_149912409639800");
		panel_4.setLayout(null);
		
		JButton button_3_4_2 = new JButton("\uAC00\uC9C0\uD30C\uC2A4\uD0C0 15000");
		button_3_4_2.setBounds(46, 368, 158, 30);
		panel_4.add(button_3_4_2);
		
		JButton button_3_4_3 = new JButton("\uAC00\uC9C0\uD30C\uC2A4\uD0C0 15000");
		button_3_4_3.setBounds(260, 368, 158, 30);
		panel_4.add(button_3_4_3);
		
		
		
		Image image9 = new ImageIcon(url + "image\\Cola_sprite.jpg").getImage();
		JLabel lbl_cola_sprite = new JLabel();
		lbl_cola_sprite.setIcon(new ImageIcon(image9.getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
		lbl_cola_sprite.setBounds(288, 33, 130, 130);
		panel_4.add(lbl_cola_sprite);
		
		JLabel lbl_steak_2_2 = new JLabel();
		lbl_steak_2_2.setBounds(284, 213, 130, 130);
		panel_4.add(lbl_steak_2_2);
		
		JLabel lbl_steak_2_3 = new JLabel();
		lbl_steak_2_3.setBounds(56, 226, 130, 130);
		panel_4.add(lbl_steak_2_3);
		
		JComboBox combo_ade = new JComboBox(new String[] { "\uB808\uBAAC\uC5D0\uC774\uB4DC\r\n\uCCAD\uD3EC\uB3C4\uC5D0\uC774\uB4DC\r\n\uC790\uBABD\uC5D0\uC774\uB4DC"});
		combo_ade.setModel(new DefaultComboBoxModel(new String[] {"\uCCAD\uD3EC\uB3C4\uC5D0\uC774\uB4DC", "\uBE14\uB8E8\uBCA0\uB9AC\uC5D0\uC774\uB4DC", "\uB808\uBAAC\uC5D0\uC774\uB4DC", "\uC790\uBABD\uC5D0\uC774\uB4DC"}));
		combo_ade.setToolTipText("");
		combo_ade.setBounds(46, 186, 158, 30);
		panel_4.add(combo_ade);
		
		

		Image image8 = new ImageIcon(url + "image\\ade.jpg").getImage();
		JLabel lbl_ade = new JLabel();
		lbl_ade.setIcon(new ImageIcon(image8.getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
		lbl_ade.setBounds(56, 33, 130, 130);
		panel_4.add(lbl_ade);
		
		JComboBox combo_ade_1 = new JComboBox(new String[] {"\uB808\uBAAC\uC5D0\uC774\uB4DC\r\n\uCCAD\uD3EC\uB3C4\uC5D0\uC774\uB4DC\r\n\uC790\uBABD\uC5D0\uC774\uB4DC"});
		combo_ade_1.setModel(new DefaultComboBoxModel(new String[] {"\uCF5C\uB77C", "\uC0AC\uC774\uB2E4"}));
		combo_ade_1.setToolTipText("");
		combo_ade_1.setBounds(280, 186, 158, 30);
		panel_4.add(combo_ade_1);
		
		JButton btn_order = new JButton("\uC8FC\uBB38\uD558\uAE30");
		btn_order.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//scrollPane.setViewportView(table);
				
			}
		});
		btn_order.setBounds(723, 472, 261, 79);
		panel.add(btn_order);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(720, 105, 264, 340);
		panel.add(scrollPane);
		DAO dao = new DAO();
		ArrayList<InsertVO> list =  dao.allSelect();
		
		
		String[] column = {"메뉴 이름", "가격" };
		String[] array = button_1.getText().split(" ");
		
		Object[][] menu = new Object[4][3];
		menu[0][0] = array[0];
		menu[0][1] = array[1];
	    Vector<String> columnNames = new Vector<String>();
	    columnNames.addElement("Column One");
	    columnNames.addElement("Column Two");
	    columnNames.addElement("Column Three");
	    row = new Vector<String>();
	    rowData = new Vector<Vector>();

	    Vector<String> columnNames1 = new Vector<String>();
	    DFMO = new DefaultTableModel(rowData, columnNames1);
	    JTable table = new JTable(DFMO);
		table.setRowHeight(25);
		//table.setModel(new DefaultTableModel(menu, column));
		scrollPane.setViewportView(table);
		
		
		panel_4.setVisible(false);
	}
	  public void datachange(){
	      int count = 0;
	      row.addElement("Row"+count+"-Column1");
	      row.addElement("Row"+count+"-Column2");
	      row.addElement("Row"+count+"-Column3");
	      rowData.addElement(row);
	      DFMO.fireTableDataChanged();
	  }
}
