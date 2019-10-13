package com.test.controller;

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
public class TableController {

    @GetMapping("/table/list")
    @ResponseBody
    public RtnResult getTableList(){
        RtnResult rtnResult = new RtnResult();
        ArrayList<Table> list = new ArrayList<>();
        Page page = new Page();
        for (int i = 0; i < 20; i++) {
            Table t = new Table();
            t.setId(i+"");
            t.setAddress("setAddress"+i);
            t.setSex("setSex"+i);
            t.setTime("setTime"+i);
            t.setUserName("setUserName"+i);
            t.setInterest("setInterest"+i);
            t.setState("1");
            t.setBirthday("setBirthday"+i);
            t.setInterest("1");
            t.setAge(i+"");
            list.add(t);
        }
        page.setPage(1);
        page.setPage_size(10);
        page.setTotal_count(30);
        page.setList(list);
        rtnResult.setCode("0");
        rtnResult.setMsg("success");
        rtnResult.setResult(page);
        System.out.println("rtnResult = " + rtnResult);
        return rtnResult;
    }
}
