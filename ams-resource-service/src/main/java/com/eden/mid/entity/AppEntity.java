package com.eden.mid.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("ams_app")
public class AppEntity extends Model<AppEntity> {
    /** 主键 */
    @TableId(type = IdType.AUTO)
    private Long id ;
    /** 编码 */
    private String code ;
    /** 名称 */
    private String name ;
    /** 地址 */
    private String url ;
    /** 状态 */
    private Integer status ;
    /** 乐观锁 */
    private Integer version ;
    /** 创建人 */
    private String createdBy ;
    /** 创建时间 */
    private Timestamp createdTime ;
    /** 更新人 */
    private String updatedBy ;
    /** 更新时间 */
    private Timestamp updatedTime ;
}