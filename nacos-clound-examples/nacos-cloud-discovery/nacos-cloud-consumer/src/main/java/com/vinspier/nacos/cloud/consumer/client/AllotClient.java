package com.vinspier.nacos.cloud.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "xcb-allot")
public interface AllotClient {

    @GetMapping("/allot/yfChannelAllot/getBrokerTree")
    ResponseEntity<String> getBrokerTree();

}
