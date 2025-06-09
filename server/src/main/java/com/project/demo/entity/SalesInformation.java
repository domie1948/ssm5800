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
 * 销售信息：(SalesInformation)表实体类
 *
 */
@TableName("`sales_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class SalesInformation implements Serializable {

    // SalesInformation编号
    @TableId(value = "sales_information_id", type = IdType.AUTO)
    private Integer sales_information_id;

    // 卖家用户
    @TableField(value = "`seller_customers`")
    private Integer seller_customers;
    // 卖家姓名
    @TableField(value = "`sellers_name`")
    private String sellers_name;
    // 店铺名称
    @TableField(value = "`store_name`")
    private String store_name;
    // 店铺地址
    @TableField(value = "`store_address`")
    private String store_address;
    // 销售日期
    @TableField(value = "`sales_date`")
    private Timestamp sales_date;
    // 销售金额
    @TableField(value = "`sales_amount`")
    private Integer sales_amount;









    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
