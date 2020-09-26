package com.vinspier.nacos.cloud.provider.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2020/9/26 22:30 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    private static final List<String> fruitNames = Arrays.asList("apple","orange","banana","pea");

    @GetMapping("/getFruitNames")
    public String getFruitNames(){
        return JSONObject.toJSONString(fruitNames);
    }

}
