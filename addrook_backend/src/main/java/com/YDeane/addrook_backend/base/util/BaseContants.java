package com.YDeane.addrook_backend.base.util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;
import java.util.Properties;

/**
 * <b>系统基础常量工具类</b>
 *
 * @author YDeane
 * @date 2021-12-15
 * @version 1.0.0
 */
public class BaseContants {
	private static Properties props = new Properties();
	//创建日志对象
	private static Logger logger = LoggerFactory.getLogger(BaseContants.class);
	static{
		try {
			//加载位于base/props/base.properties文件
			props.load(BaseContants.class.getClassLoader().getResourceAsStream("base/props/base.properties"));
		}catch(Exception e){
			//捕捉异常，输出到日志中
			logger.error(e.getMessage()+" : "+new Date(), e);
			e.printStackTrace();
		}
	}
	/**
	 * 定义常量
	 */
	//文档标题
	public static final String SWAGGER_TITLE = props.getProperty("swagger.title");
	//文档描述
	public static final String SWAGGER_DESCRIPTION = props.getProperty("swagger.description");
	//文档版本
	public static final String SWAGGER_VERSION = props.getProperty("swagger.version");
	//文档联系人姓名
	public static final String SWAGGER_CONTACT_NAME = props.getProperty("swagger.contact.name");
	//文档联系人url
	public static final String SWAGGER_CONTACT_URL = props.getProperty("swagger.contact.url");
	//文档联系人email
	public static final String SWAGGER_CONTACT_EMAIL = props.getProperty("swagger.contact.email");
}
