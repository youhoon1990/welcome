package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import model.InsertVO;

public class DAO2 {
	
	

	private Connection conn = null;
	private PreparedStatement psmt = null;
	ResultSet rs = null;
	
	private void getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			
			String user = "hr";
			String passworld = "hr";
			
			conn = DriverManager.getConnection(url, user, passworld);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//jar6 넣어줘야지  classnotfound뜨면  확인해
		
		
	}
	
	private void getClose() {
		try {
			if(rs != null)
				rs.close();
			
			if(psmt != null) 
				psmt.close();
			
			if(conn != null) 
				conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	//dao의 약자
	//db 연결 관리 객체
	//jdbc코드가 들어감
	//1. 회원가입 기능을 가지는 jdbc 코드를 메소드로 구현
	
	public int insert(InsertVO2 vo) {
		
		int result =0;
		
		
		//1. 드라이버 동적 바이ㅏㄴ딧
		//2. connection
		//3. 매개변수 받아오는 id,pw,neme,ag를 smartmember 테이블에
		//4. psmt
		//5. 닫기
		


		/*
		 * 1. 동적로딩 1-1 ojdbc6.jar파일추가 1-2 Class.forName()으로 경로지정 우리가 사용할건 오라클드라이버.class
		 * build path add external - 오라클깔린곳에서 - product - jdbc - ojdbc6 추가
		 * Class.forName("Oracle.jdbc.driver.OracleDriver");
		 * 
		 */

		try {
			getConnect();
			
			
			String sql = "insert into smartmember values (?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql); //먼저 만들어서 값을 넣어주고
			psmt.setString(1, vo.getId()); // ?인자 채워주기!
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());
			
			//* ?인자를 채워주는 작업
			
			
			
			result = psmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			System.out.println("DataBase 접속 실패!!!!");
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			
			getClose();  
			//connection   psmt  rs  열었으니 역ㄱ순으로 닫어
			
			
			
			
		}
		
		return result;
	}
	


	public String login(InsertVO2 vo) {
		String name = null;
		
		//
		try {
			getConnect();
			String sql = "select name from smartmember where id = ? and pw = ?";
			//오타였어요 깔ㄲㄹㅜㅜ
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			//실행 select 문을 실행할 때는 행에 영향을 주지 않기 때문에
			rs = psmt.executeQuery();
			rs.next();
			if(rs.next()) {
				name=rs.getString("NAME");
				//rs.getString(1);
			}
			
		
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				getClose();
				 
	}
		return name;

	}
	
	public ArrayList<InsertVO2> allSelect() {
		//1 연결
		ArrayList<InsertVO2> list = new ArrayList<InsertVO2>();
		
		try {
			getConnect();
			//
			String sql = "select * from smartmember";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			//rs는 데이터를 가지고있음    , 커서 내릴려면 rs.next();
			while(rs.next()) {
				//id, pw, name, tel가지고오기
				String id = rs.getString(1);//첫번째column가지고오겠다
				String pw = rs.getString(2);
				String name =rs.getString(3);
				int tel = rs.getInt(4);
				
				//하나로 묶는 자료형 , arraylist 만듬
				InsertVO2 vo = new InsertVO2(id, pw, name, tel);
				list.add(vo);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			getClose();
			//닫기
		}
		return list;
		
		
		
	}
	}
