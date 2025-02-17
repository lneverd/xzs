package com.mindskip.xzs;

import com.mindskip.xzs.configuration.property.SystemConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @version 3.5.0
 * @description:  学之思应用启动
 * Copyright (C), 2020-2021, 武汉思维跳跃科技有限公司
 * @date 2021/12/25 9:45
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableConfigurationProperties(value = { SystemConfig.class})
@EnableCaching
public class XzsApplication {
    public static void main(String[] args) {
        SpringApplication.run(XzsApplication.class, args);
    }
}
