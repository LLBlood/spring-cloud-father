package com.carfi.serverribbon.controller;

import com.carfi.serverribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * com.carfi.serverribbon.controller$
 *
 * @author ll
 * @date 2020-12-16 18:33:42
 **/
@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Resource
    private RibbonService ribbonService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return ribbonService.hiService(name);
    }
}
