package org.lmmarise.cloud.consumer.controller;

import org.lmmarise.cloud.consumer.feign.client.MyFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private static final Logger log = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private MyFeignClient myFeignClient;

    @GetMapping("/hello1")
    public String index() {
        String hello = myFeignClient.hello();
        System.out.println("服务消费者：" + Thread.currentThread().getName());
        System.out.println("服务提供者：" + hello);
        return hello;
    }
}