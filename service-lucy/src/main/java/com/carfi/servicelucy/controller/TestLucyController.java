package com.carfi.servicelucy.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.carfi.servicelucy.controller$
 *
 * @author ll
 * @date 2020-12-21 14:35:31
 **/
@RequestMapping("/test")
@RestController
public class TestLucyController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/lucy")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@RequestParam(value = "name", defaultValue = "carfi") String name) {
        return "lucy " + name + " ,i am from port:" + port;
    }

    public String hiError(String name) {
        return "lucy,"+name+",sorry,error!";
    }
}
