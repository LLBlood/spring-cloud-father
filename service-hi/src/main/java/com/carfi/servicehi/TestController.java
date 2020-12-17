package com.carfi.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.carfi.servicehi$
 *
 * @author ll
 * @date 2020-12-16 16:13:03
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "carfi") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
