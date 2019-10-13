package com.test.bean;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private String key;
    private String order_sn;
    private String bike_sn;
    private String user_name;
    private String mobile;
    private String distance;
    private String total_time;
    private String status;
    private String start_time;
    private String end_time;
    private String total_fee;
    private String user_pay;
    private String start_location;
    private String end_location;
    private String mode;
    private String city_id;
    private List<Position> position_list;
    private List<Area> area;
}
