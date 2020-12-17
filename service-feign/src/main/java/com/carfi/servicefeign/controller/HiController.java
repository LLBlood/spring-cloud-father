package com.carfi.servicefeign.controller;

import com.carfi.servicefeign.service.SchedualServiceHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * com.carfi.servicefeign.controller$
 *
 * @author ll
 * @date 2020-12-17 17:06:00
 **/
@RestController
public class HiController {

    @Resource
    private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
