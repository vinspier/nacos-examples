package com.vinspier.nacos.cloud.provider.controller;

import com.alibaba.fastjson.JSONObject;
import com.vinspier.nacos.cloud.provider.service.IUploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

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
@RefreshScope
public class ProviderController {

    private static final List<String> fruitNames = Arrays.asList("apple","orange","banana","pea");

    @Value("${spring.datasource:213}")
    private String dataSource;

    @Autowired
    private IUploadFileService uploadFileService;

    @GetMapping("/getFruitNames")
    public String getFruitNames(){
        return JSONObject.toJSONString(fruitNames);
    }

    @GetMapping("/getDataSource")
    public String getDataSource(){
        return dataSource;
    }

    @GetMapping("/getInfoByFileId/{fileId}")
    public String getInfoByFileId(@PathVariable String fileId){
        return JSONObject.toJSONString(uploadFileService.getInfoByFileId(fileId));
    }

}
