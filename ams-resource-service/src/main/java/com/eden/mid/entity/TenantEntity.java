package com.eden.mid.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("ams_tenant")
public class TenantEntity extends Model<TenantEntity> {
    /** 主键 */
    @TableId(type = IdType.AUTO)
    private Long id ;
    /** 租户编码 */
    private String code ;
    /** 租户名称 */
    private String name ;
    /** 法人 */
    private String legalPerson ;
    /** 手机号码 */
    private String phone ;
    /** 营业执照 */
    private String businessLicense ;
    /** 地址 */
    private String address ;
    /** 状态;0-停用、1-启用、2-审核中 */
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