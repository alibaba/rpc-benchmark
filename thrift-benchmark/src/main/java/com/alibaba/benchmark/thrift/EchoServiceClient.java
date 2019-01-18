package com.alibaba.benchmark.thrift;

import com.alibaba.benchmark.bean.ComplexDO;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import com.alibaba.benchmark.service.EchoService;
import com.alibaba.benchmark.service.ResourceService;
import  com.alibaba.benchmark.thrift.ComplexDoService;
import com.alibaba.benchmark.thrift.ComPlexDO;

import java.util.ArrayList;

public class EchoServiceClient  implements com.alibaba.benchmark.service.EchoService, ResourceService{

    int port = Integer.valueOf(System.getProperty("server.port", "8080"));
    private  TTransport transport = null;
    private  ComplexDoService.Client client=null;
    public static ComPlexDO comPlexDO=null;

    public    EchoServiceClient(){
        transport = new TSocket("localhost", port, 30000);
        // 协议要和服务端一致
        TProtocol protocol = new TBinaryProtocol(transport);
        client = new ComplexDoService.Client(protocol);
        try {
            transport.open();
        }catch (TTransportException e){
            e.printStackTrace();
        }

        comPlexDO=new ComPlexDO();
        String string1 = "A man was going to the house of some rich person. As he went along the road, he saw a box of good apples at the side of the road. He said, I do not want to eat those apples; for the rich man will give me much food; he will give me very nice food to eat. Then he took the apples and threw them away into the dust.";
        String string2 = "An old woman had a cat. The cat was very old; she could not run quickly, and she could not bite, because she was so old. One day the old cat saw a mouse; she jumped and caught the mouse. But she could not bite it; so the mouse got out of her mouth and ran away, because the cat could not bite it";
        String string3 = "Then the old woman became very angry because the cat had not killed the mouse. She began to hit the cat. The cat said, Do not hit your old servant. I have worked for you for many years, and I would work for you still, but I am too old. Do not be unkind to the old, but remember what good work the old did when they were young.";
        comPlexDO.setPint(69);
        comPlexDO.setPlong(56);
        comPlexDO.setPfloat(10);
        java.util.List<java.lang.String> strings=new ArrayList<>();
        strings.add(string1);
        strings.add(string2);
        strings.add(string3);
        comPlexDO.setStringArray(strings);
        comPlexDO.setIp("666.666.666.666");


    }


    @Override
    public Object echoComplexDO(Object Object) {
        try {
            return client.echoComplexDO((com.alibaba.benchmark.thrift.ComPlexDO) Object);
        }catch (TException e){
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public Object getComplexDO() {
        return this.comPlexDO;
    }

    @Override
    public void destroy() {
        transport.close();
    }
}
