package com.vinspier.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Decription: <br>
 * @Project: </br>
 * @CreateDate: 2020/10/19 0:20 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 * @Modify:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/getName/{name}")
    public String getName(@PathVariable String name){
        return name;
    }

}