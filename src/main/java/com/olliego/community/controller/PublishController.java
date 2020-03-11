package com.olliego.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Classname PublishController
 * @Description 发布页控制器
 * @Date 2020/3/11 13:23
 * @Created by OllieGo
 */
@Controller
public class PublishController {
    @GetMapping("/publish")
    public String publish(){
        return "publish";
    }
}