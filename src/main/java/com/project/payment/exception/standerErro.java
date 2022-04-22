package com.project.payment.exception;

import java.time.LocalDateTime;

public class standerErro {
  
	private LocalDateTime timestamp;
	private String error;
	private Integer status;
	private String apth;
	
	public standerErro() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public standerErro(LocalDateTime timestamp, String error, Integer status, String apth) {
		super();
		this.timestamp = timestamp;
		this.error = error;
		this.status = status;
		this.apth = apth;
	}



	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getApth() {
		return apth;
	}
	public void setApth(String apth) {
		this.apth = apth;
	}
	
	
}
