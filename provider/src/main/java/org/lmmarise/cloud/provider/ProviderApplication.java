package org.lmmarise.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/10/21 12:57 上午
 */
@SpringBootApplication
@EnableDiscoveryClient  // 服务发现
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
