package com.model;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----ȸ������ ���α׷�--------");
		System.out.print("ID�� �Է� >> ");
		String id = sc.next();
		System.out.print("PW�� �Է� >> ");
		String pw = sc.next();
		SmartDTO dto = new SmartDTO(id, pw);
		SmartDAO dao = new SmartDAO();

		int cnt = dao.insert(dto);

		if (cnt > 0) {
			System.out.println("ȸ������ ����");
		} else {
			System.out.println("ȸ������ ����");
		}

	}

}
