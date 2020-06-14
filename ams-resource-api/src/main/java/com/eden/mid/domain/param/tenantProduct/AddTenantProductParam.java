package com.eden.mid.domain.param.tenantProduct;
import lombok.Data;
import java.io.Serializable;
@Data
public class AddTenantProductParam implements Serializable {
    private Long tenantId;
    private Long productId;
    private Integer status;
    private String createdBy;
}
