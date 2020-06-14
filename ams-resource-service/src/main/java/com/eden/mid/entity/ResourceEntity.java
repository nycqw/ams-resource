package com.eden.mid.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("ams_resource")
public class ResourceEntity extends Model<ResourceEntity> {
    /** 主键 */
    @TableId(type = IdType.AUTO)
    private Long id ;
    /** 编码 */
    private String code ;
    /** 名称 */
    private String name ;
    /** 应用编码 */
    private String appCode ;
    /** 父级资源ID */
    private Long parentId ;
    /** 资源类型;1-菜单、2-按钮 */
    private Integer type ;
    /** 菜单地址 */
    private String menuUrl ;
    /** 菜单ICON */
    private String menuIcon ;
    /** 展示类型;0-默认不展示、1-默认展示 */
    private Integer showType ;
    /** 排序 */
    private Integer sort ;
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