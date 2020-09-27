package com.vinspier.nacos.cloud.provider.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * vinspier 版权所有 © Copyright 2020<br>
 *
 * @Description: 文件信息表<br>
 * @Project: hades <br>
 * @CreateDate: Created in 2020-08-22 <br>
 * @Author: vinspier
 */
@Data
public class UploadFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @JSONField(name = "id")
    @TableField(value = "id")
    private Long id;

    @JSONField(name = "file_id")
    @TableField(value = "file_id")
    private String fileId;

    @JSONField(name = "content_type")
    @TableField(value = "content_type")
    private String contentType;

    @JSONField(name = "file_name")
    @TableField(value = "file_name")
    private String fileName;

    @JSONField(name = "original_file_name")
    @TableField(value = "original_file_name")
    private String originalFileName;

    @JSONField(name = "group_name")
    @TableField(value = "group_name")
    private String groupName;

    @JSONField(name = "server_path")
    @TableField(value = "server_path")
    private String serverPath;

    @JSONField(name = "absolute_path")
    @TableField(value = "absolute_path")
    private String absolutePath;

    @JSONField(name = "size")
    @TableField(value = "size")
    private Long size;

    @JSONField(name = "file_type")
    @TableField(value = "file_type")
    private String fileType;

    @JSONField(name = "extension")
    @TableField(value = "extension")
    private String extension;

    @JSONField(name = "created_by")
    @TableField(value = "created_by")
    private String createdBy;

    @JSONField(name = "create_time")
    @TableField(value = "create_time")
    private Date createTime;

    @JSONField(name = "update_time")
    @TableField(value = "update_time")
    private Date updateTime;

    @JSONField(name = "updated_by")
    @TableField(value = "updated_by")
    private String updatedBy;

    @JSONField(name = "status")
    @TableField(value = "status")
    private Integer status;
}
