package com.alibaba.benchmark.rpc.dubbo;

import com.alibaba.benchmark.bean.ComplexDO;
import com.alibaba.benchmark.service.EchoService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        EchoService echoService = (EchoService) context.getBean("echoService");
        while (true) {
            try {
                System.out.println(echoService.echoComplexDO(ComplexDO.getComplexDO()));
            } catch (Throwable e) {
                e.printStackTrace();
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
}
