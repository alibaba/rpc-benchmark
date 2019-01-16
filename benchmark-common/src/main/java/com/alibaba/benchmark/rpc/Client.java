package com.alibaba.benchmark.rpc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.benchmark.bean.ComplexDO;
import com.alibaba.benchmark.service.EchoService;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        EchoService echoService = (EchoService) context.getBean("echoService");
        System.out.println(echoService.echoComplexDO(ComplexDO.getComplexDO()));
    }
}
