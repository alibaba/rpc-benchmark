package com.alibaba.benchmark.rpc.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author guanghao on 2019/1/1.
 */
public class Server {
    public static void main(String[] args) throws InterruptedException {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml")) {
            context.start();
            Thread.sleep(Integer.MAX_VALUE);
        }
    }
}
