package com.spirale.proWeb.response;

public class LoginResponse {
String message;
Boolean status;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message=message;
}
public void setStatus(Boolean status) {
	 this.status=status;
}
	public Boolean getStatus() {
		return status;
	}
	
	public LoginResponse(String message,Boolean status) {
		this.message=message;
		this.status=status;
		
	}
}
