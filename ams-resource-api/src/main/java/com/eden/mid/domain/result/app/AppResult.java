package com.eden.mid.domain.result.app;
import lombok.Data;
import java.io.Serializable;
import java.sql.Timestamp;
@Data
public class AppResult implements Serializable {
    private Long id;
    private String code;
    private String name;
    private String url;
    private Integer status;
    private Integer version;
    private String createdBy;
    private Timestamp createdTime;
    private String updatedBy;
    private Timestamp updatedTime;
}
