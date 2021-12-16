package com.YDeane.addrook_backend.base.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>系统基础控制层</b>
 *
 * @author YDeane
 * @date 2021-12-15
 * @version 1.0.0
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}
