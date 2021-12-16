package com.YDeane.addrook_backend.base.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>系统基础实体信息</b>
 *
 * @author YDeane
 * @date 2021-12-15
 * @version 1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = -3361764003561629000L;
	@TableField(exist = false)
	private String status;    //用户状态：0-禁用 1-启用
	@TableField(exist = false)
	private String createUser;  //创建人
	@TableField(value = "createTime")
	private Date createTime;    //创建时间
	@TableField(exist = false)
	private String updateUser;  //修改人
	@TableField(value = "updateTime")
	private Date updateTime;   //修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
