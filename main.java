package com.model;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----회원가입 프로그램--------");
		System.out.print("ID를 입력 >> ");
		String id = sc.next();
		System.out.print("PW를 입력 >> ");
		String pw = sc.next();
		SmartDTO dto = new SmartDTO(id, pw);
		SmartDAO dao = new SmartDAO();

		int cnt = dao.insert(dto);

		if (cnt > 0) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}

	}

}
