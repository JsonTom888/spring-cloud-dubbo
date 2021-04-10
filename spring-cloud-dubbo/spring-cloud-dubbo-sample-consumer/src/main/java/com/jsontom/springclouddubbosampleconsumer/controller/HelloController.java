package com.jsontom.springclouddubbosampleconsumer.controller;

import com.jsontom.springclouddubbosampleapi.service.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务端消费实现服务降级
 *
 *
 * @author tom
 * @version V1.0
 * @date 2021/4/7 21:02
 */
@RestController
public class HelloController {
    /**
     * check = false服务启动时不检查服务提供者是否正常可用
     * 服务提供者未启动，或者，timeout = 1当服务提供者接口响应超过1s时，会触发服务降级
     *
     */
//    @Reference(check = false, mock = "com.jsontom.springclouddubbosampleconsumer.service.IHelloServiceMock", cluster = "failfast")
    @Reference(timeout = 1, mock = "com.jsontom.springclouddubbosampleconsumer.service.IHelloServiceMock", cluster = "failfast")
    private IHelloService iHelloService;

    @RequestMapping("/say")
    public String sayHello() throws InterruptedException {
        return iHelloService.sayHello("jsontom");
    }


}
