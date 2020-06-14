package com.eden.mid.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author chenqw
 * @version 1.0
 * @since 2020/6/14
 */
@AllArgsConstructor
public enum ResourceResultEnum {

    APP_EXIST(3001, "应用已存在")
    ;

    @Getter
    private int code;
    @Getter
    private String message;

}
