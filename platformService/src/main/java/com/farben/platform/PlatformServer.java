package com.farben.platform;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import io.netty.channel.nio.NioEventLoopGroup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(
        scanBasePackages = {"com.farben"}
)
@EnableDubbo
@EnableDubboConfig
@ImportResource(locations= {"classpath:/dubbo-provider.xml","classpath:/dubbo-consumer.xml"})
public class PlatformServer {
    public static void main(String[] args) {
        NioEventLoopGroup l;
        SpringApplication app = new SpringApplication(PlatformServer.class);
        app.setWebApplicationType(WebApplicationType.SERVLET);
        app.run(args);

    }
}
