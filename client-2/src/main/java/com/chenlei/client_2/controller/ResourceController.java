package com.chenlei.client_2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 陈磊
 * @Date: 2018/6/28
 * @Description:
 */

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @RequestMapping("/")
    public String getResource() {
        return "I am client-2!!!";
    }

}
