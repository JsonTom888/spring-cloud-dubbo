package com.jsontom.springclouddubbosampleprovider.service.impl;

import com.jsontom.springclouddubbosampleapi.service.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import java.util.concurrent.TimeUnit;

/**
 *
 * cluster = "failfast"表示当前服务的容错方式为快速失败
 * loadbalance = "roundrobin"表示当前服务接口的负载均衡策略为随机算法
 *
 * @author tom
 * @version V1.0
 * @date 2021/4/7 20:50
 */
@Service(cluster = "failfast",loadbalance = "roundrobin")
public class HelloServiceImpl implements IHelloService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) throws InterruptedException {
        TimeUnit.SECONDS.sleep(40);
        return String.format("[%s]：Hello,%s",serviceName,name);
    }
}
