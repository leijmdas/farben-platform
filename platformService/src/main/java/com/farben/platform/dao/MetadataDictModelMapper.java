package com.farben.platform.dao;

import com.farben.platform.domain.MetadataDictModel;
import org.apache.ibatis.annotations.Param;
import org.mybatis.hbatis.orm.mapper.HbatisMapper;

import java.util.List;

/**
 * MetadataDictModelMapper
 * @author generator
 * @date 2019年12月29日
 */
public interface MetadataDictModelMapper extends HbatisMapper<MetadataDictModel, Integer> {
	
	
	//-- 按实体参数查询[START] 
	List<MetadataDictModel> findByQueryParam(@Param("queryParam") MetadataDictModel.QueryParam queryParam);

	long countByQueryParam(@Param("queryParam") MetadataDictModel.QueryParam queryParam);
	//-- 按实体参数查询[END] 
	
	//-- 自定义业务方法，请写在下方 -->
}