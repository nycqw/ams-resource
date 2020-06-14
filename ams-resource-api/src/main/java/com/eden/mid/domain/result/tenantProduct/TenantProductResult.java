package com.eden.mid.domain.result.tenantProduct;
import lombok.Data;
import java.io.Serializable;
import java.sql.Timestamp;
@Data
public class TenantProductResult implements Serializable {
    private Long id;
    private Long tenantId;
    private Long productId;
    private Integer status;
    private Integer version;
    private String createdBy;
    private Timestamp createdTime;
    private String updatedBy;
    private Timestamp updatedTime;
}
