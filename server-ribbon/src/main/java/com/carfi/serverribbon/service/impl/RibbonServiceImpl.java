package com.carfi.serverribbon.service.impl;

import com.carfi.serverribbon.service.RibbonService;
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
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/test/hi?name="+name,String.class);
    }
}
