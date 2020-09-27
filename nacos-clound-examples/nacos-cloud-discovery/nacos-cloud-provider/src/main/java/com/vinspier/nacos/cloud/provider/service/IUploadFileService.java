package com.vinspier.nacos.cloud.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vinspier.nacos.cloud.provider.model.UploadFile;
import org.springframework.web.multipart.MultipartFile;

/**
 * vinspier 版权所有 © Copyright 2018<br>
 *
 * @Description: 文件信息表 服务类<br>
 * @Project: hades <br>
 * @CreateDate: Created in 2020-08-22 <br>
 * @Author: vinspier
 */
public interface IUploadFileService extends IService<UploadFile> {


    UploadFile getInfoByFileId(String fileId);

}
