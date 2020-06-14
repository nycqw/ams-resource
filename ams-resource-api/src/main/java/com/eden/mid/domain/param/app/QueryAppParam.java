package com.eden.mid.domain.param.app;
import lombok.Data;
import java.io.Serializable;
@Data
public class QueryAppParam implements Serializable {
    private String code;
    private String name;
    private String url;
    private Integer status;
    private String createdBy;
}
