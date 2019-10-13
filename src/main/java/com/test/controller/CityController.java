package com.test.controller;

import com.test.bean.City;
import com.test.bean.Page;
import com.test.bean.RtnResult;
import com.test.bean.Table;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("/api")
@CrossOrigin
public class CityController {

    @GetMapping("/city/list")
    @ResponseBody
    public RtnResult getCityList(){
        RtnResult rtnResult = new RtnResult();
        ArrayList<City> list = new ArrayList<>();
        Page page = new Page();
        for (int i = 0; i < 20; i++) {
            City c = new City();
            c.setId(i+"");
            c.setName("setName"+i);
            c.setMode("1");
            c.setOp_mode("1");
            c.setOpen_time("2019-09-22");
            c.setCity_admins("admin");
            c.setFranchisee_name("setFranchisee_name"+i);
            c.setSys_user_name("setSys_user_name"+i);
            c.setUpdate_time("2019-09-22");
            list.add(c);
        }
        page.setPage(1);
        page.setPage_size(10);
        page.setTotal_count(20);
        page.setList(list);
        rtnResult.setCode("0");
        rtnResult.setMsg("success");
        rtnResult.setResult(page);
        return rtnResult;
    }
}
