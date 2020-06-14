package com.eden.mid.utils;

import com.eden.core.code.CodeGenerator;
import com.eden.mid.entity.*;

import java.io.IOException;

/**
 * @author chenqw
 * @version 1.0
 * @since 2020/6/7
 */
public class CodeUtil {

    public static void main(String[] args) {
        try {
            CodeGenerator.generate(TenantProductEntity.class);
        } catch (IOException e) {
        }
    }
}
