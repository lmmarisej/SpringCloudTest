package org.lmmarise.cloud.consumer.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/10/21 12:35 上午
 */
@Primary
// name 指向服务提供者在注册中心的名字，而其名字就是 spring.application.name
// 远程调用出现错误，改为调用本地实现。服务降级
@FeignClient(name = "provider", fallback = MyFeignClientImpl.class)
// 多个提供者在服务中心有相同的名字将组成集群
public interface MyFeignClient {

    @RequestMapping(value = "/hello")
    String hello();
}
