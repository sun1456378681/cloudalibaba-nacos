package com.cloud.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xx类
 *
 * @author eric
 * @since 2021/6/26 10:15
 */
@RestController
@RequestMapping("/test")
@RefreshScope
public class ConfigController {

    @Value("${tomcat.host}")
    private String tomcatHost;

    @GetMapping("/get")
    public String get() {
        return tomcatHost;
    }
}