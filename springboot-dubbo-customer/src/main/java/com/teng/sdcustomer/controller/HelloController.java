package com.teng.sdcustomer.controller;

import com.teng.sdapi.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tengteng
 * @version 1.0
 * @date 2021/8/17 14:22
 */
@RestController
public class HelloController {


    @DubboReference(check = false,timeout = 3000,retries = 3)
    private HelloService helloService;

    //
    @RequestMapping("/sayHello")
    public String hello(@RequestParam("name") String name) throws InterruptedException {

        return  helloService.sayHello(name);
    }
    @RequestMapping("/sayHello/{name}")
    public String hello1(@PathVariable("name") String name) throws InterruptedException {

        return  helloService.sayHello(name);
    }
}
