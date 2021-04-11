package com.jsontom.springclouddubbosampleconsumer.service;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/11 16:30
 */
public class DubboSpiTest {

    public static void main(String[] args) {
        ExtensionLoader<DubboSpi> extensionLoader = ExtensionLoader.getExtensionLoader(DubboSpi.class);
        DubboSpi dubboSpi = extensionLoader.getExtension("myDubboSpi");
        System.out.println(dubboSpi.connect());
    }

}
