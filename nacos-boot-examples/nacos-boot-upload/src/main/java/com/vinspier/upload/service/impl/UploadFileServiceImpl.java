package com.vinspier.upload.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vinspier.upload.mapper.UploadFileMapper;
import com.vinspier.upload.model.UploadFile;
import com.vinspier.upload.service.IUploadFileService;
import org.springframework.stereotype.Service;

/**
 * vinspier 版权所有 © Copyright 2018<br>
 *
 * @Description: 文件信息表 服务实现类<br>
 * @Project: hades <br>
 * @CreateDate: Created in 2020-08-22 <br>
 * @Author: vinspier
 */
@Service
public class UploadFileServiceImpl extends ServiceImpl<UploadFileMapper, UploadFile> implements IUploadFileService {

    @Override
    public UploadFile getInfoByFileId(String fileId) {
        LambdaQueryWrapper<UploadFile> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UploadFile::getId,fileId);
        return super.getOne(wrapper);
    }
}
