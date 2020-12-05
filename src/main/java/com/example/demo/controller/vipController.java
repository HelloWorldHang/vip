package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author brady.si
 */
@RestController
public class vipController {
    @Autowired
    private OrderFeign orderFeign;
    @RequestMapping("/vipTest")
    public String memTest(){
        String str = orderFeign.orderTest();
        System.out.println("--------------------------------------------------------");
        return str;
    }
}
