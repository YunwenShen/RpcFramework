package com.company;

/**
 * @author ShenYunWen
 **/
public class RpcProvider {

    public static void main(String[] args) throws Exception {
        HelloService helloService = new HelloServiceImpl();
        RpcFramework.export(helloService, 8080);
    }
}
