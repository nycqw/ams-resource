package com.eden.mid.domain.param.resource;
import lombok.Data;
import java.io.Serializable;
@Data
public class AddResourceParam implements Serializable {
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
    private String createdBy;
}
