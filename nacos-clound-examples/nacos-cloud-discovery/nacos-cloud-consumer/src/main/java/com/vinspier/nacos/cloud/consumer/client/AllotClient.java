package com.vinspier.nacos.cloud.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Decription: <br>
 * @Project: </br>
 * @CreateDate: 2020/10/6 10:27 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 * @Modify:
 */
@FeignClient(value = "xcb-allot")
public interface AllotClient {

    @GetMapping("/allot/yfChannelAllot/getBrokerTree")
    ResponseEntity<String> getBrokerTree();

}
