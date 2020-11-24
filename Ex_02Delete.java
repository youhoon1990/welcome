package d1124;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_02Delete {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;

		// TODO Auto-generated method stub

//		*jdbc �������
		// ojbdc6.jar �־��ֱ� ��Ű���ͽ��÷η�
//		 * 1. ����̹� �ε�(�����ε� = �������ε�)
		// ��ü���� ������ Ÿ���� ���� ���ص� �����ϴ� ���� �� Ÿ���� �������ִ� ���
		// �����Ű���� �ִ��� �ּҰ� ���°��� forName�ȿ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

//			 * 2. DB���� connection ��ü ����
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";// �ܿ�����
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "DELETE FROM SMART WHERE ID = 'suzy'";

			psmt = conn.prepareStatement(sql);

			int cnt = psmt.executeUpdate();

			System.out.println("������ ���� ���� ���� : " + cnt);

			if (cnt > 0) {
				System.out.println("���� ���� ����");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6. (1)psmt�ݱ�
			// (2) conn �ݱ�
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
					
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

//		 * 3. SQL ���� ����
//		 * 4. PreparedStatement ��ü ����
//		 * 5. ����
//		 * 6. finally  �ڿ��� �ݱ�

	}

}
