package com.YDeane.addrook_backend.base.pojo.vo;
import com.YDeane.addrook_backend.base.pojo.enums.ResponseCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * <b>系统响应视图信息</b>
 *
 * @author6
 * @date
 * @since
 */
@ApiModel(value = "系统响应视图信息",description = "系统响应视图信息")
public class ResponseVO implements Serializable {
	private static final long serialVersionUID = -5949774161118548731L;
	@ApiModelProperty(value = "响应编码")
	private Integer code;  //响应编码
	@ApiModelProperty(value = "响应信息")
	private String message; //响应信息
	@ApiModelProperty(value = "响应数据")
	private Object data;   //响应数据
	public ResponseVO(ResponseCode responseCode, String message, Object data){
		this.code = responseCode.getCode();
		this.message = message;
		this.data = data;
	}
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * 获得系统响应成功信息
	 * @param
	 * @return
	 */
	public static ResponseVO getSuccess(){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS,ResponseCode.RESPONSE_SUCCESS.getRemark(), " ");
	}
	/**
	 * 获得系统响应成功信息
	 * @param message
	 * @return
	 */
	public static ResponseVO getSuccess(String message){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS,message, " ");
	}

	/**
	 * 获得系统响应成功数据
	 * @param message
	 * @param data
	 * @return
	 */
	public static ResponseVO getSuccess(String message,Object data){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS,message,data);
	}
	/**
	 * <b>获得用户未进行系统认证视图信息</b>
	 * @return
	 */
	public static ResponseVO getUnAuth() {
		return new ResponseVO(ResponseCode.RESPONSE_UNAUTH, ResponseCode.RESPONSE_UNAUTH.getRemark(), "");
	}

	/**
	 * <b>获得系统业务处理逻辑错误视图信息</b>
	 * @param errorMsg
	 * @return
	 */
	public static ResponseVO getError(String errorMsg) {
		return new ResponseVO(ResponseCode.RESPONSE_ERROR, errorMsg, "");
	}

	/**
	 * <b>获得系统响应异常视图信息</b>
	 * @param e
	 * @return
	 */
	public static ResponseVO getException(Exception e) {
		return new ResponseVO(ResponseCode.RESPONSE_EXCEPTION, e.getMessage(), "");
	}
}
