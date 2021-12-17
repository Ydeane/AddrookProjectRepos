package com.YDeane.addrook_backend.pojo.vo;

import com.YDeane.addrook_backend.base.pojo.vo.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * <b></b>
 *
 * @author
 * @date
 * @since
 */
@ApiModel(value = "个人通讯录——通讯录视图信息")
public class AddrookVO extends BaseVO implements Serializable {
	private static final long serialVersionUID = -4688547086657899673L;
	@ApiModelProperty(value = "主键id")
	private Long id ;        //主键id
	@ApiModelProperty(value = "序号")
	private Long no ;        //序号
	@NotNull(message = "未填写姓名")
	@ApiModelProperty(value = "用户姓名")
	private String name;     //用户姓名
	@NotNull(message = "未填写手机号码")
	@Pattern(regexp = "1[0-9]{10}",message = "手机号码格式错误")
	@ApiModelProperty(value = "手机号码")
	private String cellphone;  //手机号码
	@ApiModelProperty(value = "家庭住址")
	private String address;  //家庭住址

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
