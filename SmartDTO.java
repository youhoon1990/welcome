package com.model;

public class SmartDTO {
	//2�� �ʵ� �����
	// id p w
	//2���� �Ű������� �޴� �������� �����
	//getter�޼ҵ常 �����
	
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
