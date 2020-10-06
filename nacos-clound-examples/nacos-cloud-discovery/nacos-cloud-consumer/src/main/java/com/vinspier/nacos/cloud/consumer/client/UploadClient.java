package com.vinspier.nacos.cloud.consumer.client;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Decription: 上传服务客户端 <br>
 * @Project: </br>
 * @CreateDate: 2020/10/6 10:26 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 * @Modify:
 */
@FeignClient(value = "upload-service")
public interface UploadClient {


    /**
     * 通过文件fileId获取文件信息
     *
     * @param fileId 文件id
     * @return java.lang.String <br>
     * @CreateDate 2020/10/6 10:39 <br>
     * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
     * @Modify:
     */
    @GetMapping("/provider/getInfoByFileId/{fileId}")
    String getInfoByFileId(@PathVariable("fileId")String fileId);

}
