package com.carfi.servicefeign.service;

import com.carfi.servicefeign.fallback.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * com.carfi.servicefeign.controller$
 *
 * @author ll
 * @date 2020-12-17 17:03:31
 **/
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @GetMapping(value = "/test/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
