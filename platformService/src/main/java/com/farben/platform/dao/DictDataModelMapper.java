package com.farben.platform.dao;

import com.farben.platform.domain.DictDataModel;
import org.apache.ibatis.annotations.Param;
import org.mybatis.hbatis.orm.mapper.HbatisMapper;

import java.util.List;

/**
 * DictDataModelMapper
 * @author generator
 * @date 2020年02月20日
 */
public interface DictDataModelMapper extends HbatisMapper<DictDataModel, Integer> {
	
	
	//-- 按实体参数查询[START] 
	List<DictDataModel> findByQueryParam(@Param("queryParam") DictDataModel.QueryParam queryParam);

	long countByQueryParam(@Param("queryParam") DictDataModel.QueryParam queryParam);
	//-- 按实体参数查询[END] 
	
	//-- 自定义业务方法，请写在下方 -->
}