package com.farben.platform.consts;
/**
 * 
 * @className: PfAppConsts
 * @description: 应用基本配置常量 
 * @author zz  | www.integriti.cn
 * @date 2018年4月18日  
 *
 */
public class PfAppConsts {

	
	protected static String[] MYBATIS_MAPPER_LOCATIONS = new String[] {"classpath*:/mapper/metadata/*/*.xml","classpath*:/mapper/*.xml"};
	
	protected static String MYBATIS_BASE_PACKAGE = "com.farben.platform.dao,com.farben.metadata.dao";

}
