package com.jsontom.springclouddubbosampleconsumer.service;

import com.jsontom.springclouddubbosampleapi.service.Driver;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/11 16:13
 */
public class MysqlDriver implements Driver {
    @Override
    public String connect() {
        return "连接Mysql数据库";
    }
}
