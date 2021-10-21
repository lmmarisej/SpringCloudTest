package org.lmmarise.cloud.consumer.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/10/21 12:35 上午
 */
@FeignClient(name = "provider")
public interface MyFeignClient {

    @RequestMapping(value = "/hello")
    String hello();
}
