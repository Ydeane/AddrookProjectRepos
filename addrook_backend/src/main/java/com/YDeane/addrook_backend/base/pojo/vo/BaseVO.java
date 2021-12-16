package com.YDeane.addrook_backend.base.pojo.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>系统用户基础实体信息视图类</b>
 *
 * @author YDeane
 * @date 2021-12-15
 * @version 1.0.0
 */
@ApiModel(value = "基础视图信息")
public class BaseVO implements Serializable {
	private static final long serialVersionUID = 5228351710749861498L;
	@ApiModelProperty(value = "用户状态：0-禁用 1-启用")
	private String status;    //用户状态：0-禁用 1-启用
	@ApiModelProperty(value = "创建时间")
	private Date createTime;    //创建时间
	@ApiModelProperty(value = "修改时间")
	private Date updateTime;   //修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
