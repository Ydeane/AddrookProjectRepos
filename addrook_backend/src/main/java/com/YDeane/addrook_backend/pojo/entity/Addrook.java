package com.YDeane.addrook_backend.pojo.entity;

import com.YDeane.addrook_backend.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <b>通讯录实体类</b>
 *
 * @author
 * @date
 * @since
 */
@TableName("sys_user")
public class Addrook extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 7467641505978676606L;
	@TableId(value = "id",type = IdType.AUTO)
	private Long id ;        //主键id
	@TableField(value = "name")
	private String name;     //用户姓名
	@TableField(value = "cellphone")
	private String cellphone;  //手机号码
	@TableField(value = "address")
	private String address;  //家庭住址

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
