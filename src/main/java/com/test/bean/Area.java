package com.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Area {
    private Double lon;
    private Double lat;
    private String ts;
}
