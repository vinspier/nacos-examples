package com.vinspier.nacos.cloud.consumer.service;

import org.springframework.http.ResponseEntity;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2020/9/26 23:16 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 */
public interface FruitService {

   ResponseEntity<String> getFruitNames();

}
