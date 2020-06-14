package com.eden.mid.domain.result.product;
import lombok.Data;
import java.io.Serializable;
import java.sql.Timestamp;
@Data
public class ProductResult implements Serializable {
    private Long id;
    private String code;
    private String name;
    private String description;
    private Double price;
    private Integer pricingMode;
    private Integer paymentMode;
    private Integer status;
    private Integer version;
    private String createdBy;
    private Timestamp createdTime;
    private String updatedBy;
    private Timestamp updatedTime;
}
