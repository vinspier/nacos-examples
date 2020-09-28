package com.vinspier.upload.controller;

import com.alibaba.fastjson.JSONObject;
import com.vinspier.upload.service.IUploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2020/9/27 20:07 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 */
@RestController
@RequestMapping("/uploadFile")
public class UploadController {

    @Autowired
    private IUploadFileService uploadFileService;

    @GetMapping("/getInfoByFileId/{fileId}")
    public String getInfoByFileId(@PathVariable String fileId){
        return JSONObject.toJSONString(uploadFileService.getInfoByFileId(fileId));
    }

}
