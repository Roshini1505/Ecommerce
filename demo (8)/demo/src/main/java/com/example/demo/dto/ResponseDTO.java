package com.example.demo.dto;

public class ResponseDTO {
	
	private String message;
	
	private int statuscode;
	
	public ResponseDTO() {
		
	}
	
	public ResponseDTO(String message, int statuscode) {
		super();
		this.message=message;
		this.statuscode=statuscode;
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message=message;
	}
	
	
	public int getstatuscode() {
		return statuscode;
	}
	public void setstatuscode(int statuscode) {
		this.statuscode=statuscode;
	}
	

}
