package com.YDeane.addrook_backend.base.pojo.enums;
/**
 * <b>系统响应信息编码枚举类</b>
 *
 * @author
 * @date
 * @since
 */
public enum ResponseCode {
	RESPONSE_SUCCESS(20000,"系统响应成功"),
	RESPONSE_UNAUTH(30000,"未进行认证"),
	RESPONSE_ERROR(40000,"系统响应失败"),
	RESPONSE_EXCEPTION(50000,"系统响应异常")
	;
	private Integer code ;  //响应编码
	private String remark;  //响应说明

	ResponseCode() {
	}

	private ResponseCode(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
