package com.myDubbo.provider.service;

import com.myDubbo.service.HelloDubboService;


public class HelloDubboServiceImpl implements HelloDubboService{
    @Override
    public String helloDubbo(String name) {
        return "这是provider1提供的:" + name;
    }
}
