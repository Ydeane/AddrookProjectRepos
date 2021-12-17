package com.YDeane.addrook_backend.service;

import com.YDeane.addrook_backend.base.pojo.vo.PageVO;
import com.YDeane.addrook_backend.pojo.vo.AddrookVO;

/**
 * <b>个人通讯录——业务层接口</b>
 *
 * @author
 * @date
 * @since
 */
public interface AddrookService {
	/**
	 * 分页查询用户列表
	 * @param pageVO
	 * @return
	 */
	PageVO<AddrookVO> getPage(PageVO<AddrookVO> pageVO)throws Exception;
}
