package com.myDubbo.provider.service;

import com.myDubbo.service.HelloDubboService;

public class HelloDubboServiceImpl implements HelloDubboService{
    @Override
    public String helloDubbo(String name) {
        return "hello:" + name;
    }
}