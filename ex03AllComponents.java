package d1126GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;

public class ex03AllComponents {

	private JFrame frame;
	private JTextField text_name;
	private JRadioButton rd_man, rd_woman;
	private int R, G, B = 0;
	private JButton btn_color;
	private JTable table;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex03AllComponents window = new ex03AllComponents();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
// 어떤게 안 돼요? 

	public ex03AllComponents() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "name_202891525900100");
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JLabel lbl_name = new JLabel("\uC774\uB984");
		lbl_name.setBounds(12, 32, 90, 24);
		panel.add(lbl_name);
		
		JLabel lbl_gender = new JLabel("\uC131\uBCC4");
		lbl_gender.setBounds(12, 81, 90, 24);
		panel.add(lbl_gender);
		
		JLabel lbl_hobby = new JLabel("\uCDE8\uBBF8");
		lbl_hobby.setBounds(12, 154, 90, 24);
		panel.add(lbl_hobby);
		
		JLabel lbl_combo = new JLabel("\uC870\uD569");
		lbl_combo.setBounds(12, 209, 90, 24);
		panel.add(lbl_combo);
		
		text_name = new JTextField();
		text_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String text = text_name.getText();
				System.out.println(text);



				
			}
		});
		text_name.setBounds(97, 34, 284, 21);
		panel.add(text_name);
		text_name.setColumns(10);
		
		JCheckBox cb_code = new JCheckBox("\uCF54\uB529");
		cb_code.setBounds(82, 155, 76, 23);
		panel.add(cb_code);
		
		JCheckBox cb_movie = new JCheckBox("\uC601\uD654");
		cb_movie.setBounds(178, 155, 76, 23);
		panel.add(cb_movie);
		
		JCheckBox cb_book = new JCheckBox("\uB3C5\uC11C");
		cb_book.setBounds(284, 155, 76, 23);
		panel.add(cb_book);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//내가 선택한 데이터 값을 가지고 와서 콘솔창에 출력
				// 1. combobox에서 데이터 가지고 오기
				System.out.println(comboBox.getSelectedItem());
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uD53C\uC790 + \uC18C\uC8FC", "\uD584\uBC84\uAC70+\uB9E5\uC8FC", "\uCE58\uD0A8+\uB9E5\uC8FC"}));
		comboBox.setBounds(97, 210, 129, 23);
		panel.add(comboBox);
		
		//man woman 하나만 눌리게 함
		ButtonGroup group = new ButtonGroup();
	
		
		rd_man = new JRadioButton("\uB0A8\uC790");
		rd_man.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		rd_man.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		rd_man.setBounds(89, 82, 97, 23);
		panel.add(rd_man);
		
		rd_woman = new JRadioButton("\uC5EC\uC790");
		rd_woman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		rd_woman.setBounds(231, 82, 97, 23);
		panel.add(rd_woman);
		
		group.add(rd_man);
		group.add(rd_woman);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		
		btn_color = new JButton("\uC0C9\uC0C1 \uBCC0\uACBD");
		btn_color.setBounds(60, 290, 290, 53);
		panel_1.add(btn_color);
		//그 맨마자ㅣ막에 한걸 제대로 못들었어요 ㅎㅎㅎㅎ Event 실행할 때 btn_color가 생성되어 있지 않아서 null 에러가 뜨길래 이 부분을
		// 이렇게 모든 slider 위쪽으로 넣어줬답니 봐복꼐요 btn컬러붙 ㅓ위로해웢야하는군요
		
		JSlider slider_r = new JSlider();
		slider_r.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//Jslider에서 수치값을 가지고 오는 방법
				 R  = slider_r.getValue();
				 // 잠시만요!
				 btn_color.setBackground(new Color(R, G, B));
				// setback 안에 들어가는 것은 color 객체
			}
		});
		slider_r.setForeground(Color.RED);
		slider_r.setMinorTickSpacing(10);
		slider_r.setMajorTickSpacing(50);
		slider_r.setMaximum(255);
		slider_r.setSnapToTicks(true);
		slider_r.setPaintTicks(true);
		slider_r.setPaintLabels(true);
		slider_r.setBounds(28, 34, 374, 46);
		panel_1.add(slider_r);
		
		JSlider slider_g = new JSlider();
		slider_g.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				 G  = slider_g.getValue();
				 btn_color.setBackground(new Color(R, G, B));
			}
		});
		slider_g.setForeground(Color.GREEN);
		slider_g.setMinorTickSpacing(10);
		slider_g.setMajorTickSpacing(50);
		slider_g.setMaximum(255);
		slider_g.setPaintLabels(true);
		slider_g.setPaintTicks(true);
		slider_g.setSnapToTicks(true);
		slider_g.setBounds(28, 122, 362, 46);
		panel_1.add(slider_g);
		
		JSlider slider_b = new JSlider();
		slider_b.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				 B  = slider_b.getValue();//아 
				 btn_color.setBackground(new Color(R, G, B));
			}
		});
		slider_b.setForeground(Color.BLUE);
		slider_b.setMinorTickSpacing(10);
		slider_b.setMajorTickSpacing(50);
		slider_b.setMaximum(255);
		slider_b.setSnapToTicks(true);
		slider_b.setPaintTicks(true);
		slider_b.setPaintLabels(true);
		slider_b.setBounds(28, 212, 362, 46);
		panel_1.add(slider_b);
		
	
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 405, 426);
		panel_2.add(scrollPane);
		//sring 배열은   column명
		// data가 들어있는 Object(최상위 클래스) 2차원 배열
		String[] column = {"이름", "나이", "성별"};
		Object[][] data = {{"김운비", "20살", "여자"}, {"나예호", "21살", "남자"}, {"김리현", "19살", "여자"}, {"김재휘", "25살", "여자"}, {"흑두부", "8살", "남자"}, {"김운비", "20살", "여자"}, {"나예호", "21살", "남자"}, {"김리현", "19살", "여자"}, {"김재휘", "25살", "여자"}, {"흑두부", "8살", "남자"}, {"김운비", "20살", "여자"}, {"나예호", "21살", "남자"}, {"김리현", "19살", "여자"}, {"김재휘", "25살", "여자"}, {"흑두부", "8살", "남자"}, {"김운비", "20살", "여자"}, {"나예호", "21살", "남자"}, {"김리현", "19살", "여자"}, {"김재휘", "25살", "여자"}, {"흑두부", "8살", "남자"}, {"김운비", "20살", "여자"}, {"나예호", "21살", "남자"}, {"김리현", "19살", "여자"}, {"김재휘", "25살", "여자"}, {"흑두부", "8살", "남자"}, {"김운비", "20살", "여자"}, {"나예호", "21살", "남자"}, {"김리현", "19살", "여자"}, {"김재휘", "25살", "여자"}, {"흑두부", "8살", "남자"}};
		
		table = new JTable(data, column);
		//테이블 내부의 행의(칸의) 크기를 변경하는 방법
		table.setRowHeight(25);
		//스크롪패널 없으면 scroll이 생기지 않는다.
		scrollPane.setViewportView(table);
		
		JToggleButton toggleButton = new JToggleButton("New toggle button");
		tabbedPane.addTab("New tab", null, toggleButton, null);
		
	}
}
