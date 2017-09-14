package com.springcloud.boot.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册服务器环境
 * 通过(application.properties)
 * eureka.client.registerWithEureka：false和fetchRegistry：false来表明自己是一个eureka server.
 * @author 蓝眼泪
 * 2017-9-11下午12:09:23
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
