package com.eden.mid.domain.result.resource;
import lombok.Data;
import java.io.Serializable;
import java.sql.Timestamp;
@Data
public class ResourceResult implements Serializable {
    private Long id;
    private String code;
    private String name;
    private String appCode;
    private Long parentId;
    private Integer type;
    private String menuUrl;
    private String menuIcon;
    private Integer showType;
    private Integer sort;
    private Integer status;
    private Integer version;
    private String createdBy;
    private Timestamp createdTime;
    private String updatedBy;
    private Timestamp updatedTime;
}
