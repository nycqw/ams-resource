package com.eden.mid.domain.result.productResource;
import lombok.Data;
import java.io.Serializable;
import java.sql.Timestamp;
@Data
public class ProductResourceResult implements Serializable {
    private Long id;
    private Long productId;
    private Long appId;
    private Long resourceId;
    private Integer status;
    private Integer version;
    private String createdBy;
    private Timestamp createdTime;
    private String updatedBy;
    private Timestamp updatedTime;
}
