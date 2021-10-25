package org.lmmarise.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/10/21 12:34 上午
 */
@SpringBootApplication
/*切到consul*/
//@EnableDiscoveryClient//(autoRegister = false)    // 让服务中心发现、扫描到服务
@EnableFeignClients
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
