package com.lihong.csuftcampus.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 标签表
 */
@TableName(value = "tag")
@Data
public class Tag implements Serializable {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 标签名
     */
    private String tagName;

    /**
     * 标签颜色
     */
    private String tagColor;

    /**
     * 创建用户ID
     */
    private Long userId;

    /**
     * 引用次数
     */
    private Long postNum;

    /**
     * 逻辑删除 0-1
     */
    @TableLogic
    private Integer isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}