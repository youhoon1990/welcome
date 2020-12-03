package com.model;

public class SmartDTO {
	//2개 필드 만들어
	// id p w
	//2개의 매개변수를 받느 ㄴ생성자 만들고
	//getter메소드만 만들어
	
	private String id;
	private String pw;
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	
public SmartDTO(String id, String pw) {
	this.id = id;
	this.pw = pw;
}

}
