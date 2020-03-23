package com.farben.platform.config.redis;


import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    @ConfigurationProperties(prefix="spring.redis")
    @Primary
    public RedisProperties redisProperties() {
        RedisProperties redisProperties = new RedisProperties();
        return redisProperties;
    }
    @Bean(name = "stringRedisTemplate")
    public StringRedisTemplate sringRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        StringRedisSerializer stringSerializer = new StringRedisSerializer();
        StringRedisTemplate redisTemplate = new StringRedisTemplate();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setValueSerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(stringSerializer);
        redisTemplate.setStringSerializer(stringSerializer);
        redisTemplate.setDefaultSerializer(stringSerializer);
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        return redisTemplate;
    }

//    @Bean("loginSsoRedisTemplate")
//    public RedisTemplate<String, LoginSso> loginSsoRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        StringRedisSerializer stringSerializer = new StringRedisSerializer();
//
//        RedisTemplate<String, LoginSso> redisTemplate = new RedisTemplate<String, LoginSso>();
//        redisTemplate.setKeySerializer(stringSerializer);
//        redisTemplate.setValueSerializer(new FastJsonRedisSerializer<LoginSso>(LoginSso.class));
//        redisTemplate.setHashKeySerializer(stringSerializer);
//        redisTemplate.setHashKeySerializer(stringSerializer);
//        redisTemplate.setHashValueSerializer(new FastJsonRedisSerializer<SysUserDTO>(SysUserDTO.class));
//
//        redisTemplate.setConnectionFactory(redisConnectionFactory);
//        return redisTemplate;
//    }
//
//
//
//    @Bean("sysUserRedisTemplate")
//    public RedisTemplate<String, SysUserDTO> sysUserRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
//
//        StringRedisSerializer stringSerializer = new StringRedisSerializer();
//        RedisTemplate<String, SysUserDTO> redisTemplate = new RedisTemplate<String, SysUserDTO>();
//        redisTemplate.setKeySerializer(stringSerializer);
//        redisTemplate.setValueSerializer(new FastJsonRedisSerializer<SysUserDTO>(SysUserDTO.class));
//        redisTemplate.setHashKeySerializer(stringSerializer);
//        redisTemplate.setHashValueSerializer(new FastJsonRedisSerializer<SysUserDTO>(SysUserDTO.class));
//
//        redisTemplate.setConnectionFactory(redisConnectionFactory);
//        return redisTemplate;
//    }

}
