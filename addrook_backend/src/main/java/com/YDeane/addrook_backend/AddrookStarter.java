package com.YDeane.addrook_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <b>项目启动类</b>
 *
 * @author YDeane
 * @date 2021-12-15
 * @version 1.0.0
 */
@MapperScan("com.YDeane.addrook_backend.dao")
@SpringBootApplication
public class AddrookStarter {
	public static void main(String[] args) {
		SpringApplication.run(AddrookStarter.class, args);
	}
}
