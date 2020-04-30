package com.hom.service2.service;

import com.hom.dubbo.service2.Service2Api;

/**
 * @author Administrator
 * @version 1.0
 **/
@org.apache.dubbo.config.annotation.Service
public class Service2ApiImpl implements Service2Api {
    public String dubboService2() {
        System.out.println("provider invoke dubboService2");
        return "dubboService2";
    }
}
