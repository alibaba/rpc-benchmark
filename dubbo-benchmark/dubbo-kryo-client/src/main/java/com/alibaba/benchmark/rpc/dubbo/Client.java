package com.alibaba.benchmark.rpc.dubbo;

import com.alibaba.benchmark.bean.ComplexDO;
import com.alibaba.benchmark.service.EchoService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
//        context.start();
//        EchoService echoService = (EchoService) context.getBean("echoService");
//        while (true) {
//            try {
//                System.out.println(echoService.echoComplexDO(ComplexDO.getComplexDO()));
//            } catch (Throwable e) {
//                e.printStackTrace();
//                TimeUnit.SECONDS.sleep(1);
//            }
//        }



            //--ObjectInputStream/ObjectOutputStream--对象输入/输出流

            //程序内部创建一个byte型别数组的缓冲区，然后利用ByteArrayOutputStream和ByteArrayInputStream的实例向数组中写入或读出byte型数据
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {

            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(ComplexDO.getComplexDO());
            System.out.println("序列化后a的字节数：" + bos.toByteArray().length);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
