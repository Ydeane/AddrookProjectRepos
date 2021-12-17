package com.YDeane.addrook_backend.controller;

import com.YDeane.addrook_backend.base.controller.BaseController;
import com.YDeane.addrook_backend.base.pojo.vo.PageVO;
import com.YDeane.addrook_backend.base.pojo.vo.ResponseVO;
import com.YDeane.addrook_backend.pojo.vo.AddrookVO;
import com.YDeane.addrook_backend.service.AddrookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.annotation.Resource;
import java.util.List;

/**
 * <b>个人通讯录——控制层</b>
 *
 * @author
 * @date
 * @since
 */
@Api(value = "个人通讯录——控制层",tags = "个人通讯录——控制层")
@CrossOrigin
@RestController("addrookController")
@RequestMapping("/addrook")
public class AddrookController extends BaseController{
	@Resource(name = "addrookService")
	private AddrookService addrookService;

	@PostMapping("/page/{pageNum}/{pageSize}")
	public ResponseVO getPageVOList(Integer pageNum, Integer pageSize)  throws Exception{
		//创建分页查询对象
		PageVO<AddrookVO> pageVO = new PageVO<AddrookVO>(pageNum,pageSize);
		//根据分页查询对象查询分页列表
		pageVO = addrookService.getPage(pageVO);
		//将结果返回给前端
		return ResponseVO.getSuccess("分页查询成功",pageVO);
	}

}
