package com.jsontom.springclouddubbosampleconsumer.service;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/11 16:27
 */
public class MyDubboSpi implements DubboSpi {
    @Override
    public String connect() {
        return "MyDubboSpi";
    }
}
