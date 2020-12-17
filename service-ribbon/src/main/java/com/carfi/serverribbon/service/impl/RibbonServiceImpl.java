package com.carfi.serverribbon.service.impl;

import com.carfi.serverribbon.service.RibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * com.carfi.serverribbon.service.impl$
 *
 * @author ll
 * @date 2020-12-16 18:14:54
 **/
@Service("ribbonService")
public class RibbonServiceImpl implements RibbonService {
    @Resource
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/test/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
