package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 卖家：(Seller)表实体类
 *
 */
@TableName("`seller`")
@Data
@EqualsAndHashCode(callSuper = false)
public class Seller implements Serializable {

    // Seller编号
    @TableId(value = "seller_id", type = IdType.AUTO)
    private Integer seller_id;

    // 卖家姓名
    @TableField(value = "`sellers_name`")
    private String sellers_name;
    // 店铺名称
    @TableField(value = "`store_name`")
    private String store_name;
    // 店铺地址
    @TableField(value = "`store_address`")
    private String store_address;






    // 用户编号
    @TableField(value = "user_id")
    private Integer userId;



    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
