package com.farben.platform.config.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.hbatis.spring.HbatisSqlSessionDaoSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import org.springframework.beans.factory.annotation.Qualifier;
import static com.farben.platform.consts.SqlSessionFactoryConsts.SqlSessionFactory_NAME_PF;

@Configuration
public class PfSqlSessionConfig {
	
	@Bean(name = "daoSupport")
	@Lazy(value=true)
	public HbatisSqlSessionDaoSupport daoSupport(@Qualifier(SqlSessionFactory_NAME_PF)SqlSessionFactory sqlSessionFactory) {
		HbatisSqlSessionDaoSupport s = new HbatisSqlSessionDaoSupport(sqlSessionFactory);
		s.setSqlSessionFactory(sqlSessionFactory);
		
		return s;
	}
}
