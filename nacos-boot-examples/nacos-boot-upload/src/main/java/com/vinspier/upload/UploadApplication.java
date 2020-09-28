package com.vinspier.upload;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2020/9/27 20:04 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 */
@SpringBootApplication
@MapperScan("com.vinspier.upload.mapper")
@NacosPropertySource(dataId = "upload-service-test.yaml", autoRefreshed = true)
public class UploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadApplication.class,args);
    }

}
