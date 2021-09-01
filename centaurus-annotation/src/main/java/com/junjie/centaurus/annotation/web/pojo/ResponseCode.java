package com.junjie.centaurus.annotation.web.pojo;

public enum ResponseCode {

	SUCCESS(1200, "请求成功"), ERROR(1400, "请求失败");

	private Integer code;

	private String message;

	private ResponseCode(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer code() {
		return this.code;
	}

	public String message() {
		return this.message;
	}

}
