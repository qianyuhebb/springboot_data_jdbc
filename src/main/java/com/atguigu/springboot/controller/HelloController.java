package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 时间：  2020/2/19
 * 创建者：  Administrator 钟文
 * 描述：
 * 参数：
 * 返回值：
 **/
@Controller
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/query")
    @ResponseBody
    public Map getALL(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from department");
        return  maps.get(0);
    }
}
