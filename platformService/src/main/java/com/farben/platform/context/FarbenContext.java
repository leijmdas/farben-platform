package com.farben.platform.context;


import com.farben.platform.service.service.RedisService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import static com.farben.platform.consts.SqlSessionFactoryConsts.SqlSessionFactory_NAME_PF;

@Component
public class FarbenContext implements ApplicationContextAware {


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        appCtxt = applicationContext;


    }

    public static ApplicationContext getAppCtxt() {
        return appCtxt;
    }

    public static RedisService getRedisService() {
        if (redisService == null) {
            redisService = appCtxt.getBean("redisService", RedisService.class);

        }
        return redisService;
    }



    public static SqlSessionFactory getSqlSessionFactory(){
        return appCtxt.getBean(SqlSessionFactory_NAME_PF, SqlSessionFactory.class);

    }

    private static ApplicationContext appCtxt;
    private static RedisService redisService;


}