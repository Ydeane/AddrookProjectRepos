package com.YDeane.addrook_backend.base.pojo.enums;

/**
 * <b>用户状态枚举类</b>
 *
 * @author  YDeane
 * @date 2021-12-15
 * @version 1.0.0
 */
public enum Status {
	STATUS_ENABLE("1","启用"),
	STATUS_DISABLE("0","禁用")
	;
	private String code;   //响应编码
	private String remark;  //响应说明

	private Status(String code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
