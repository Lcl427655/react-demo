package com.test.controller;

import com.test.bean.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api")
@CrossOrigin
public class OrderController {

    @GetMapping("/order/list")
    @ResponseBody
    public RtnResult getOrderList(){
        RtnResult rtnResult = new RtnResult();
        ArrayList<Order> list = new ArrayList<>();
        Page page = new Page();
        for (int i = 0; i < 20; i++) {
            Order o = new Order();
            o.setBike_sn(i+"");
            o.setOrder_sn(i+"");
            o.setDistance(1*1000+"");
            o.setEnd_time("2019-11-11");
            o.setMobile("15941173445");
            o.setStart_time("2019-02-02");
            o.setStatus("1");
            o.setTotal_fee(i*10+"");
            o.setTotal_time(i*100+"");
            o.setUser_name("setUser_name"+i);
            o.setUser_pay("setUser_pay"+i);
            list.add(o);
        }
        page.setPage(1);
        page.setPage_size(10);
        page.setTotal_count(40);
        page.setList(list);
        rtnResult.setCode("0");
        rtnResult.setMsg("success");
        rtnResult.setResult(page);
        return rtnResult;
    }

    @GetMapping("/order/detail")
    @ResponseBody
    public RtnResult getOrderDetail(String orderId){
        System.out.println("orderId = [" + orderId + "]");
        RtnResult rtnResult = new RtnResult();
        Order o = new Order();
        o.setBike_sn("1");
        o.setOrder_sn("2");
        o.setDistance(1*1000+"");
        o.setEnd_time("2019-11-11");
        o.setMobile("15941173445");
        o.setStart_time("2019-02-02");
        o.setStatus("2");
        o.setTotal_fee("10");
        o.setTotal_time("200");
        o.setUser_name("setUser_name");
        o.setUser_pay("setUser_pay");
        o.setStart_location("Start_location");
        o.setEnd_location("End_location");
        o.setMobile("1");
        o.setCity_id("1");
        List<Position> positions = Arrays.asList(new Position(116.361221, 40.043776), new Position(116.363736, 40.038086), new Position(116.373438, 40.03538));
        List<Area> area = Arrays.asList(new Area(116.361221, 40.043776,null), new Area(116.363736, 40.038086,null), new Area(116.373438, 40.03538,null));
        o.setPosition_list(positions);
        o.setArea(area);
        rtnResult.setCode("0");
        rtnResult.setMsg("success");
        rtnResult.setResult(o);
        return rtnResult;
    }
}
