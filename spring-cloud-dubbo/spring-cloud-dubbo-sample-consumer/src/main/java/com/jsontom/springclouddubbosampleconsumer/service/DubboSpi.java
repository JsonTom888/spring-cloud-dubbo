package com.jsontom.springclouddubbosampleconsumer.service;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/11 16:25
 */
@SPI
public interface DubboSpi {
    String connect();
}
