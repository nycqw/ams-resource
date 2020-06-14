package com.eden.mid.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("ams_product")
public class ProductEntity extends Model<ProductEntity> {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 产品编码
     */
    private String code;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 产品说明
     */
    private String description;
    /**
     * 价格
     */
    private Double price;
    /**
     * 计价方式;1-按月、2-按年、3-永久
     */
    private Integer pricingMode;
    /**
     * 付费方式;1-预付费、2-后付费
     */
    private Integer paymentMode;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 乐观锁
     */
    private Integer version;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Timestamp createdTime;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    private Timestamp updatedTime;
}
