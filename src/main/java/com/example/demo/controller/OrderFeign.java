package com.example.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author brady.si
 */
@Service
@FeignClient("order-server")
public interface OrderFeign {
    @RequestMapping("/orderTest")
    String orderTest();
}
