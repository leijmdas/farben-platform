package com.farben.platform.testcase;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.remoting.transport.netty4.NettyClient;
import com.farben.platform.PlatformServer;
import com.farben.platform.api.dto.FileInfoDTO;
import com.farben.platform.api.model.MetadataDictModelDTO;
import com.farben.platform.api.service.FileApiService;
import com.farben.platform.common.utils.FarbenUtils;
import com.jtest.annotation.JTest;
import com.jtest.utility.testlog.JTestLog;
import io.netty.channel.nio.NioEventLoopGroup;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

;

/**
 * 
 * @name BaseTest
 * @author zz  | www.xwparking.com
 * @date 2018年11月23日  
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PlatformServer.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class TestDubbo {
    @Reference(lazy = true, version = "${dubbo.service.version}")
    private FileApiService fileApiService;
    // 处理文件上传
    @Before
    public void setup() {
       
    }

    @Test
    public void test0001_sapiLogin() {
        FileInfoDTO fileInfo = fileApiService.upload("test", "txt",  "test".getBytes(), null);
        JTestLog.logJtest(FarbenUtils.toJSONStringPretty(fileInfo));
    }


    @Test
    public void test0002_MetadataDictApiService_findById() throws Exception {
        //MetadataDictModelDTO metadataDictModelDTO = metadataDictApiService.findById(59);
        //System.out.println(metadataDictModelDTO);
        NettyClient l;
        NioEventLoopGroup dd;
    }

}

