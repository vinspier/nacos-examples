package com.vinspier.nacos.boot.config.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.vinspier.nacos.boot.config.properties.CustomizeProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2020/9/26 11:42 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private CustomizeProperty customizeProperty;

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;
    @NacosValue(value = "${nacos.test.propertie:123}", autoRefreshed = true)
    private String testProperties;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public boolean get() {
        return useLocalCache;
    }

    @GetMapping("/getAreaRoundPerception")
    public Integer getAreaRoundPerception(){
        return customizeProperty.getAreaRoundPerception();
    }

    @GetMapping("/getGroupRoundPerception")
    public Integer getGroupRoundPerception(){
        return customizeProperty.getGroupRoundPerception();
    }

    @GetMapping("/getPersonalRoundPerception")
    public Integer getPersonalRoundPerception(){
        return customizeProperty.getPersonalRoundPerception();
    }

    @GetMapping("/getCustomizeProperty")
    public String getCustomizeProperty(){
        return JSONObject.toJSONString(customizeProperty);
    }

}
