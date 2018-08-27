package com.company;

/**
 * @author ShenYunWen
 **/
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
