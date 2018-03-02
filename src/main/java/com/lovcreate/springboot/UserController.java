package com.lovcreate.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Tom
 * @date: 2018/3/1
 * @time: 10:42
 **/
@RestController
public class UserController {


    @RequestMapping(value = "hello")
    public String hello() {
        return "Hello springBoot";
    }
}
