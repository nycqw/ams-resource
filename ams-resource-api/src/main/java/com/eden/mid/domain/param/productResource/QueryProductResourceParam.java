package com.eden.mid.domain.param.productResource;
import lombok.Data;
import java.io.Serializable;
@Data
public class QueryProductResourceParam implements Serializable {
    private Long productId;
    private Long appId;
    private Long resourceId;
    private Integer status;
    private String createdBy;
}
