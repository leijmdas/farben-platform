package com.farben.platform.dao;

import com.farben.platform.domain.MetadataFieldModel;
import org.apache.ibatis.annotations.Param;
import org.mybatis.hbatis.orm.mapper.HbatisMapper;

import java.util.List;

/**
 * MetadataFieldModelMapper
 * @author generator
 * @date 2020年02月17日
 */
public interface MetadataFieldModelMapper extends HbatisMapper<MetadataFieldModel, Integer> {
	
	
	//-- 按实体参数查询[START] 
	List<MetadataFieldModel> findByQueryParam(@Param("queryParam") MetadataFieldModel.QueryParam queryParam);

	long countByQueryParam(@Param("queryParam") MetadataFieldModel.QueryParam queryParam);
	//-- 按实体参数查询[END] 
	
	//-- 自定义业务方法，请写在下方 -->
}