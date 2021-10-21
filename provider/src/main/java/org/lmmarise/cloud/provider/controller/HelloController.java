package org.lmmarise.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务接口
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/10/21 12:57 上午
 */
@RestController
public class HelloController {
    @Value("${my.provider.name}")
    private String name;        // 服务提供者名称
    @Value("${server.port}")
    private String port;        // 服务提供者端口号

    /**
     * 提供的接口，用于返回信息
     */
    @RequestMapping("/hello")
    public String hello() {
        return "provider:" + name + " port:" + port;
    }
}
