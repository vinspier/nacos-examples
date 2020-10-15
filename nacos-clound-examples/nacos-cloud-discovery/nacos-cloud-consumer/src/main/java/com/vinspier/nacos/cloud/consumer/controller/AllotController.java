package com.vinspier.nacos.cloud.consumer.controller;

import com.vinspier.nacos.cloud.consumer.service.AllotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allot")
public class AllotController {

    @Value("${customize.test}")
    private String customizeTest;

    @Autowired
    private AllotService allotService;

    @RequestMapping("/getBrokerTree")
    public String getBrokerTree(){
        return allotService.getBrokerTree().getBody();
    }

    @RequestMapping("/getCustomizeTest")
    public String getCustomizeTest(){
        return customizeTest;
    }

}
