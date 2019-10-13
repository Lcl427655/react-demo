package com.test.bean;

import lombok.Data;

@Data
public class Page {
    private Integer page;
    private Integer page_size;
    private Integer total_count;
    private Object list;
}
