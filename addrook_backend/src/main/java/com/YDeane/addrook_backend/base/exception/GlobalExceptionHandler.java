package com.YDeane.addrook_backend.base.exception;
import com.YDeane.addrook_backend.base.pojo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * <b>全局异常处理类</b>
 *
 * @author YDeane
 * @date 2021-12-15
 * @version 1.0.0
 */
@RestControllerAdvice("globalExceptionHandler")
public class GlobalExceptionHandler {
	//当出现异常时，需要记录日志，创建Logger对象
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * <b>全局异常处理</b>
	 * @param request
	 * @param response
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseVO globalException(HttpServletRequest request, HttpServletResponse response,  Exception e){
		//将错误信息输出到日志中
		logger.error(e.getMessage()+" : "+new Date(), e);
		//将产生的异常信息视图返回给前端
		return ResponseVO.getException(e);
	}

}
