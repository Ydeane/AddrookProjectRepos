package com.YDeane.addrook_backend.util;

import com.YDeane.addrook_backend.pojo.entity.Addrook;
import com.YDeane.addrook_backend.pojo.vo.AddrookVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * <b></b>
 *
 * @author
 * @date
 * @since
 */
@Mapper(componentModel = "spring")
public interface PojoMapper {
	PojoMapper INASTANCE = Mappers.getMapper(PojoMapper.class);

	/**
	 * 将实体列表转换为视图列表
	 * @param entityList
	 * @return
	 */
	List<AddrookVO> parsToVOList(List<Addrook> entityList);
}
