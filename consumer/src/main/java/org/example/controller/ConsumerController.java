package org.example.controller;

import org.example.client.ProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConsumerController {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    /**
     * 动态代理对象，内部远程调用服务生产者
     */
    @Autowired
    private ProviderClient providerClient;


    @GetMapping("/service")
    public String service(){
        logger.info("consumer invoke");
        //远程调用
        String service = providerClient.service();
        return "comsumer invoke "+ service;
    }

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        String service = providerClient.echo(string);
        return "comsumer invoke "+ service;
    }
}
