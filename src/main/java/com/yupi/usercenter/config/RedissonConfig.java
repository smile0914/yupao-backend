package com.yupi.usercenter.config;

import lombok.Data;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient(){
        //1、创建配置
        Config config = new Config();
        String redisAddress = "redis://192.168.64.139:6379";
        config.useSingleServer().setAddress(redisAddress).setDatabase(3).setPassword("111");
        //2.创建实例
        RedissonClient redisson = Redisson.create(config);
        return redisson;
    }
}
