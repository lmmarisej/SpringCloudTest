package org.lmmarise.cloud.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/10/25 10:07 下午
 */
@RestController
public class LimitController {

    AtomicInteger count = new AtomicInteger(1);
    int count1 = 1;

    @RequestMapping("/test-limit/1")
    public String limit1() {
        System.out.println(new Date().getSeconds() + "s:" + count.getAndIncrement());
        return "limit";
    }

    @RequestMapping("/test-limit/2")
    public String limit2() {
        System.out.println(new Date().getSeconds() + "s:" + (count1++));
        return "limit";
    }
}
