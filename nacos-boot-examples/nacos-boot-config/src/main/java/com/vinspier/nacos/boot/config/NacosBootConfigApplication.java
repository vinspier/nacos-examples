package com.vinspier.nacos.boot.config;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2020/9/26 11:40 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 */
@SpringBootApplication
@NacosPropertySource(dataId = "nacos-boot-config",autoRefreshed = true)
public class NacosBootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosBootConfigApplication.class,args);
    }

}
