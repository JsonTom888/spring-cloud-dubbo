package com.jsontom.springclouddubbosampleconsumer.controller;

import com.jsontom.springclouddubbosampleapi.service.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/7 21:02
 */
@RestController
public class HelloController {

    @Reference
    private IHelloService iHelloService;

    @RequestMapping("/say")
    public String sayHello(){
        return iHelloService.sayHello("jsontom");
    }

}
