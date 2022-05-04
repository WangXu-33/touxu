package com.touxu.article.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王旭
 * @Description
 * @date 2022/4/30 16:16
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/")
    public String test(){
        System.out.println("郭冰洁是个大蠢猪");
        return "hello world";
    }
}
