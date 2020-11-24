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

//		*jdbc 연결과정
		// ojbdc6.jar 넣어주기 패키지익스플로러
//		 * 1. 드라이버 로딩(동적로딩 = 동적바인딩)
		// 구체적인 데이터 타입을 알지 못해도 실행하는 순간 그 타입을 결정해주는 기능
		// 어느패키지에 있는지 주소값 적는거임 forName안에
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

//			 * 2. DB연결 connection 객체 생성
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";// 외우지마
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "DELETE FROM SMART WHERE ID = 'suzy'";

			psmt = conn.prepareStatement(sql);

			int cnt = psmt.executeUpdate();

			System.out.println("영향을 받은 행의 개수 : " + cnt);

			if (cnt > 0) {
				System.out.println("수지 삭제 성공");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6. (1)psmt닫기
			// (2) conn 닫기
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

//		 * 3. SQL 구분 생성
//		 * 4. PreparedStatement 객체 생성
//		 * 5. 실행
//		 * 6. finally  자원들 닫기

	}

}
