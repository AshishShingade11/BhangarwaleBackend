package com.bhangarwale.www.exceptions;

import java.util.Date;

public class ExceptionResponseBean {
	
	private Date timeStamp;
	
	private String message;
	
	private String descriptions;

	public ExceptionResponseBean(Date timeStamp, String message, String descriptions) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.descriptions = descriptions;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	
	

}
