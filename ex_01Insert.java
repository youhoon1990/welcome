package d1124;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex_01Insert {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;
		/*
		 * 1. �����ε� 1-1 ojdbc6.jar�����߰� 1-2 Class.forName()���� ������� �츮�� ����Ұ� ����Ŭ����̹�.class
		 * build path add external - ����Ŭ�򸰰����� - product - jdbc - ojdbc6 �߰�
		 * Class.forName("Oracle.jdbc.driver.OracleDriver");
		 * 
		 */

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");

			// 2, DATABASE����
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			// 1521�� ����Ŭ ���� ��Ʈ��ȣ
			String user = "hr";
			String passworld = "hr";
			// java.sql�� �ִ� connection�� ����Ʈ�ؾ���
			conn = DriverManager.getConnection(url, user, passworld);
			if (conn != null) {
				System.out.println("DataBase���� ����");
			} else {
				System.out.println("DataBase���� ����");
			}

			// 3. SQL �������
			String sql = "insert into smart values ('suzy', '1010')";
			psmt = conn.prepareStatement(sql);
			// PreparedStatement�� ����Ÿ���� PreparedStatement
			// PreparedStatement �� sql�� �����ͺ��̽��� �Ű��ִ� ����ī

			int cnt = psmt.executeUpdate(); // ����Ʈ����ҋ�?
			if (cnt > 0) {
				System.out.println("ȸ������ ����");

			} else {
				System.out.println("ȸ������ ����");

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("DataBase ���� ����");
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			// ��ü�� �ݾ�����

			// 4.�ݱ� (�����ͺ��̽� �ڿ��ݳ� �������� �ݾ������)
			// (1) psmt �ݱ� (���� psmt ��������ȭ ���ٰ�)
			try {
				if (psmt != null) {
					psmt.close(); // null �� ��� NullPointerException�����߹Ƿ�
				}
				// (2) connection �ݱ�
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// finally�� try, catch�� ������� ����Ǵ��� ������finally�� �������� �����
		// finally �ڵ� �ۼ��� ���������� ���� �۾�

	}

}
