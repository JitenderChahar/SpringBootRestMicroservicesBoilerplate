package com.dzee.gslab.model;

public class ErrorMessage {
	private String status;
	private String errormsg;

	public ErrorMessage() {
	}

	public ErrorMessage(String status, String errormsg) {
		this.status = status;
		this.errormsg = errormsg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

}
