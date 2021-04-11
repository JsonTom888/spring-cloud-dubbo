package com.jsontom.springclouddubbosampleconsumer.service;

import com.jsontom.springclouddubbosampleapi.service.Driver;

import java.util.ServiceLoader;


/**
 * Java Spi扩展点实现
 *
 * @author tom
 * @version V1.0
 * @date 2021/4/11 16:13
 */
public class SpiMain {
    public static void main(String[] args) {
        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);
        serviceLoader.forEach(driver -> System.out.println(driver.connect()));
    }
}
