package com.vinspier.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Decription: alibaba 限流服务测试启动类 <br>
 * @Project: </br>
 * @CreateDate: 2020/10/16 17:24 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 * @Modify:
 */

@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication.class,args);
    }
}
