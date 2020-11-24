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
		 * 1. 동적로딩 1-1 ojdbc6.jar파일추가 1-2 Class.forName()으로 경로지정 우리가 사용할건 오라클드라이버.class
		 * build path add external - 오라클깔린곳에서 - product - jdbc - ojdbc6 추가
		 * Class.forName("Oracle.jdbc.driver.OracleDriver");
		 * 
		 */

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");

			// 2, DATABASE연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			// 1521은 오라클 쓸때 포트번호
			String user = "hr";
			String passworld = "hr";
			// java.sql에 있는 connection을 임포트해야함
			conn = DriverManager.getConnection(url, user, passworld);
			if (conn != null) {
				System.out.println("DataBase접속 성공");
			} else {
				System.out.println("DataBase접속 실패");
			}

			// 3. SQL 문장실행
			String sql = "insert into smart values ('suzy', '1010')";
			psmt = conn.prepareStatement(sql);
			// PreparedStatement는 리턴타입이 PreparedStatement
			// PreparedStatement 앤 sql을 데이터베이스에 옮겨주는 리어카

			int cnt = psmt.executeUpdate(); // 셀렉트사용할떄?
			if (cnt > 0) {
				System.out.println("회원가입 성공");

			} else {
				System.out.println("회원가입 실패");

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("DataBase 접속 실패");
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			// 객체를 닫아주자

			// 4.닫기 (데이터베이스 자원반납 역순으로 닫아줘야함)
			// (1) psmt 닫기 (먼저 psmt 전역변수화 해줄것)
			try {
				if (psmt != null) {
					psmt.close(); // null 인 경우 NullPointerException오류뜨므로
				}
				// (2) connection 닫기
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// finally는 try, catch중 어느쪽이 실행되더라도 무조건finally가 마지막에 실행됨
		// finally 코드 작성과 전역변수로 빼는 작업

	}

}
