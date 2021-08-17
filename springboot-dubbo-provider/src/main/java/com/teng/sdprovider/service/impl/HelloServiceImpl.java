package com.teng.sdprovider.service.impl;

import com.teng.sdapi.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author tengteng
 * @version 1.0
 * @date 2021/8/15 16:08
 */

@DubboService//Dubbo的service  暴露服务
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) throws InterruptedException {
        System.out.println("service-----3---");
        Thread.sleep(5000);
        return "Hello" + name;
    }
}
