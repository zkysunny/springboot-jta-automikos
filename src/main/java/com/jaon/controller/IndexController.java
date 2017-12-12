package com.jaon.controller;

import com.jaon.config.DBConfig1;
import com.jaon.config.DBConfig2;
import com.jaon.test01.service.Service01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jason on 2017/12/12.
 */

@RestController
public class IndexController {

    //注入test01业务
    @Autowired
    private Service01  service01;

    //调用业务test01
    @RequestMapping("/index")
    public String index(){
        service01.addUser1andUser2("jason",12);
        return "success";
    }
}
