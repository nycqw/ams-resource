package com.eden.mid.domain.param.tenant;
import lombok.Data;
import java.io.Serializable;
@Data
public class AddTenantParam implements Serializable {
    private String code;
    private String name;
    private String legalPerson;
    private String phone;
    private String businessLicense;
    private String address;
    private Integer status;
    private String createdBy;
}
