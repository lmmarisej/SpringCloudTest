package org.lmmarise.cloud.consumer.feign.client;

import org.springframework.stereotype.Component;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/10/25 4:34 下午
 */
@Component
public class MyFeignClientImpl implements MyFeignClient {

    @Override
    public String hello() {
        return "出现错误";
    }
}
