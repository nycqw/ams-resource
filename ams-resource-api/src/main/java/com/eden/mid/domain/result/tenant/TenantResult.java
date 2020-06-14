package com.eden.mid.domain.result.tenant;
import lombok.Data;
import java.io.Serializable;
import java.sql.Timestamp;
@Data
public class TenantResult implements Serializable {
    private Long id;
    private String code;
    private String name;
    private String legalPerson;
    private String phone;
    private String businessLicense;
    private String address;
    private Integer status;
    private Integer version;
    private String createdBy;
    private Timestamp createdTime;
    private String updatedBy;
    private Timestamp updatedTime;
}
