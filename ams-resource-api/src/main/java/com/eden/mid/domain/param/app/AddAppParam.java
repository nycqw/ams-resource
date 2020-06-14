package com.eden.mid.domain.param.app;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
@Data
public class AddAppParam implements Serializable {
    @NotEmpty
    private String code;
    @NotEmpty
    private String name;
    private String url;
    private Integer status;
    private String createdBy;
}
