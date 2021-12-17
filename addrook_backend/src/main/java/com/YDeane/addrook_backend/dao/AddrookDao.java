package com.YDeane.addrook_backend.dao;

import com.YDeane.addrook_backend.controller.AddrookController;
import com.YDeane.addrook_backend.pojo.entity.Addrook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <b>个人通讯录——数据访问持久层</b>
 *
 * @author
 * @date
 * @since
 */
@Repository("addrookDao")
public interface AddrookDao extends BaseMapper<Addrook> {

}
