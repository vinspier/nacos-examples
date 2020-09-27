package com.vinspier.nacos.cloud.consumer.service.impl;

import com.vinspier.nacos.cloud.consumer.client.FruitProviderClient;
import com.vinspier.nacos.cloud.consumer.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2020/9/26 23:17 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 */
@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    private FruitProviderClient fruitProviderClient;

    @Override
    public ResponseEntity<String> getFruitNames() {
        return fruitProviderClient.getFruitNames();
    }
}
