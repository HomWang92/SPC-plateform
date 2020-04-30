package com.hom.service1.service;

import com.hom.dubbo.service1.Service1Api;
import com.hom.dubbo.service2.Service2Api;

/**
 * @author Administrator
 * @version 1.0
 **/
@org.apache.dubbo.config.annotation.Service
public class Service1ApiImpl implements Service1Api {

    @org.apache.dubbo.config.annotation.Reference
    Service2Api service2Api;

    public String dubboService1() {
        //远程调用service2
        String s = service2Api.dubboService2();
        return "dubboService1|"+s;
    }
}
