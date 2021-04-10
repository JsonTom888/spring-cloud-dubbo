package com.jsontom.springclouddubbosampleconsumer.service;

import com.jsontom.springclouddubbosampleapi.service.IHelloService;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/7 22:27
 */
public class IHelloServiceMock implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "Sorry, 服务无法访问，返回降级数据";
    }
}
