package org.example;

import org.example.controller.ConsumerController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerApplication
{
    private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    public static void main(String[] args) {

        logger.info("服务消费者启动成功");
        System.out.println("服务消费者启动成功");
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
