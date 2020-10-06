package com.vinspier.nacos.cloud.consumer.controller;

import com.vinspier.nacos.cloud.consumer.client.UploadClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Decription: 上传文件接口类 <br>
 * @Project: </br>
 * @CreateDate: 2020/10/6 10:44 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 * @Modify:
 */
@RestController
@RequestMapping(value = "/upload")
public class UploadController {

    @Autowired
    private UploadClient uploadClient;

    /**
     * 通过文件fileId获取文件信息
     *
     * @param fileId 文件id
     * @return java.lang.String <br>
     * @CreateDate 2020/10/6 10:39 <br>
     * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
     * @Modify:
     */
    @GetMapping("/getInfoByFileId/{fileId}")
    public String getInfoByFileId(@PathVariable("fileId")String fileId){
        return uploadClient.getInfoByFileId(fileId);
    }

}
