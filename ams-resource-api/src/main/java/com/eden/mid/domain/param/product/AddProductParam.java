package com.eden.mid.domain.param.product;
import lombok.Data;
import java.io.Serializable;
@Data
public class AddProductParam implements Serializable {
    private String code;
    private String name;
    private String description;
    private Double price;
    private Integer pricingMode;
    private Integer paymentMode;
    private Integer status;
    private String createdBy;
}
