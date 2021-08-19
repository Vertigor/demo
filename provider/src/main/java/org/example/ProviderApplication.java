package org.example;

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
public class ProviderApplication
{
    public static void main( String[] args )
    {
        System.out.println("服务提供者启动成功");
        SpringApplication.run(ProviderApplication.class, args);
    }
}
