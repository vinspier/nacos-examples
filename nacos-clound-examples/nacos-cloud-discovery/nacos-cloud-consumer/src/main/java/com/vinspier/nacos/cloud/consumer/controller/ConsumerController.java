package com.vinspier.nacos.cloud.consumer.controller;

import com.vinspier.nacos.cloud.consumer.client.FruitProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2020/9/26 22:54 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FruitProviderClient fruitProviderClient;

    @GetMapping("/getFruitNames")
    public String getFruitNames() {
        return restTemplate.getForObject("http://nacos-cloud-provider/provider/getFruitNames", String.class);
    }

    @GetMapping("/getFruitNamesByClient")
    public String getFruitNamesByClient() {
        return fruitProviderClient.getFruitNames().getBody();
    }

}
