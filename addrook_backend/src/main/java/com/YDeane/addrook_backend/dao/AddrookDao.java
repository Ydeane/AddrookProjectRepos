package com.YDeane.addrook_backend.dao;

import com.YDeane.addrook_backend.controller.AddrookController;
import com.YDeane.addrook_backend.pojo.entity.Addrook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <b></b>
 *
 * @author
 * @date
 * @since
 */
@Repository("addrookDao")
public interface AddrookDao extends BaseMapper<Addrook> {
}
