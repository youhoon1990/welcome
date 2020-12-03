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
		//jar6 �־������  classnotfound�߸�  Ȯ����
		
		
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
	//dao�� ����
	//db ���� ���� ��ü
	//jdbc�ڵ尡 ��
	//1. ȸ������ ����� ������ jdbc �ڵ带 �޼ҵ�� ����
	
	public int insert(InsertVO2 vo) {
		
		int result =0;
		
		
		//1. ����̹� ���� ���̤�����
		//2. connection
		//3. �Ű����� �޾ƿ��� id,pw,neme,ag�� smartmember ���̺�
		//4. psmt
		//5. �ݱ�
		


		/*
		 * 1. �����ε� 1-1 ojdbc6.jar�����߰� 1-2 Class.forName()���� ������� �츮�� ����Ұ� ����Ŭ����̹�.class
		 * build path add external - ����Ŭ�򸰰����� - product - jdbc - ojdbc6 �߰�
		 * Class.forName("Oracle.jdbc.driver.OracleDriver");
		 * 
		 */

		try {
			getConnect();
			
			
			String sql = "insert into smartmember values (?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql); //���� ���� ���� �־��ְ�
			psmt.setString(1, vo.getId()); // ?���� ä���ֱ�!
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());
			
			//* ?���ڸ� ä���ִ� �۾�
			
			
			
			result = psmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			System.out.println("DataBase ���� ����!!!!");
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			
			getClose();  
			//connection   psmt  rs  �������� ���������� �ݾ�
			
			
			
			
		}
		
		return result;
	}
	


	public String login(InsertVO2 vo) {
		String name = null;
		
		//
		try {
			getConnect();
			String sql = "select name from smartmember where id = ? and pw = ?";
			//��Ÿ����� �򤢤��̤�
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			//���� select ���� ������ ���� �࿡ ������ ���� �ʱ� ������
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
		//1 ����
		ArrayList<InsertVO2> list = new ArrayList<InsertVO2>();
		
		try {
			getConnect();
			//
			String sql = "select * from smartmember";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			//rs�� �����͸� ����������    , Ŀ�� �������� rs.next();
			while(rs.next()) {
				//id, pw, name, tel���������
				String id = rs.getString(1);//ù��°column��������ڴ�
				String pw = rs.getString(2);
				String name =rs.getString(3);
				int tel = rs.getInt(4);
				
				//�ϳ��� ���� �ڷ��� , arraylist ����
				InsertVO2 vo = new InsertVO2(id, pw, name, tel);
				list.add(vo);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			getClose();
			//�ݱ�
		}
		return list;
		
		
		
	}
	}
