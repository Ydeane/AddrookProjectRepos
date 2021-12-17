package com.YDeane.addrook_backend.service.impl;

import com.YDeane.addrook_backend.base.pojo.vo.PageVO;
import com.YDeane.addrook_backend.dao.AddrookDao;
import com.YDeane.addrook_backend.pojo.entity.Addrook;
import com.YDeane.addrook_backend.pojo.vo.AddrookVO;
import com.YDeane.addrook_backend.service.AddrookService;
import com.YDeane.addrook_backend.util.PojoMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * <b>个人通讯录——业务层接口实现类</b>
 *
 * @author
 * @date
 * @since
 */
@Service("addrookService")
@Transactional
public class AddrookServiceImpl implements AddrookService {
	@Autowired
	private AddrookDao addrookDao;
	/**
	 * 分页查询用户信息列表
	 * @param pageVO
	 * @return
	 */
	@Override
	public PageVO<AddrookVO> getPage(PageVO<AddrookVO> pageVO) throws Exception{
		//创建MyBatis Plus 所提供的分页对象page
		Page page = new Page(pageVO.getPageNum(),pageVO.getPageSize());
		//使用Mybatis Plus所提供的查询方法selectPage（）进行分页查询
		IPage<Addrook> iPage = addrookDao.selectPage(page, new QueryWrapper<Addrook>());
		//获得分页列表
		List<Addrook> entityList = iPage.getRecords();
		//将实体列表转换为视图列表
		List<AddrookVO>  voList = PojoMapper.INASTANCE.parsToVOList(entityList);
		//将列表添加到分页视图对象中
		//判断分页列表是否查询成功
		if(voList != null && !voList.isEmpty()){
			//循环分页列表
			for (int i = 0; i < voList.size();i++){
				//创建一个AddrookVO视图对象
				AddrookVO addrookVO = voList.get(i);
				//设置序号的值
				addrookVO.setNo((long) ((pageVO.getPageNum() - 1) * pageVO.getPageSize() + i + 1));
			}
		}
		pageVO.setList(voList);
		//设置总页数
		pageVO.setTotalPages(iPage.getPages());
		//设置总条数
		pageVO.setTotalSizes(iPage.getTotal());

		return pageVO;
	}
}
