package org.lmmarise.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    /**
     * 代码方式实现转发
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // 注意这里是转发到 http://www.cxk.com/hello/**
                // 截取到来的 URL 与 /hello/** 匹配上的部分，追加到 uri 后面
                .route("hello", r -> r.path("/hello/**").uri("http://www.cxk.com"))
                .build();
    }
}
