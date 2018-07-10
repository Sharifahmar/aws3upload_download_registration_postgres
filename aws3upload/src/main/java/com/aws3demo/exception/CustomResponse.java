package com.aws3demo.exception;

public class CustomResponse {

	private String errDesc;

	public CustomResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomResponse(String errDesc) {
		super();
		this.errDesc = errDesc;
	}

	public String getErrDesc() {
		return errDesc;
	}

	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}

}
