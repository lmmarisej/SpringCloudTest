package org.lmmarise.cloud.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/10/25 7:08 下午
 */
@RestController
public class NotFoundController {

    @RequestMapping(value = "/notfound")
    public Mono<Map<String, String>> notFound() {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("code", "404");
        stringMap.put("data", "found");
        return Mono.just(stringMap);
    }
}
