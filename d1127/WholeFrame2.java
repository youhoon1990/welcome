package d1127;

import java.awt.BorderLayout;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

class WholeFrame2 extends JFrame {

	JTable userTable;
	JScrollPane listJs;
	JPanel listPanel;

	Vector<String> userColumn = new Vector<String>();
	DefaultTableModel model;
	Vector<String> userRow;

	public WholeFrame2(String title) {
		//super(title);

		userColumn.addElement("Name"); // 열 추가
		userColumn.addElement("Session");

		model = new DefaultTableModel(userColumn, 0); // 테이블 모델 생성
		userTable = new JTable(model); // 테이블 생성

		setBounds(150, 100, 200, 200);
		setResizable(false);

		listPanel = new JPanel();
		listPanel.setLayout(new BorderLayout());
		listJs = new JScrollPane(userTable);
		listPanel.add(listJs, BorderLayout.CENTER);

		add(listPanel);

		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		userRow = new Vector<String>(); // 내용추가 (행추가)
		userRow.addElement("홍길동");
		userRow.addElement("의적");
		model.addRow(userRow);

	}
}

