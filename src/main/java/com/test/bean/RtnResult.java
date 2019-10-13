package com.test.bean;

import lombok.Data;

@Data
public class RtnResult {
    private String code;
    private String msg;
    private Object result;
}
