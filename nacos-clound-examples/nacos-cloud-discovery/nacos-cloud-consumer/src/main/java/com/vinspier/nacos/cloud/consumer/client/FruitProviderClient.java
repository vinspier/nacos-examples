package com.vinspier.nacos.cloud.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2020/9/26 22:59 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 */
@FeignClient(value = "nacos-cloud-provider")
public interface FruitProviderClient {

    /**
     * 通过id查询品牌
     * */
    @GetMapping("/provider/getFruitNames")
    ResponseEntity<String> getFruitNames();

}
