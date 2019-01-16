package com.alibaba.benchmark.grpc;


import com.alibaba.benchmark.Client;
import com.alibaba.benchmark.service.EchoService;
import com.alibaba.benchmark.service.ResourceService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author linqiuping
 */
public class EchoServiceClient implements EchoService, ResourceService {
    private static final Logger logger = Logger.getLogger(Client.class.getName());

    private final ManagedChannel channel;

    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    public static ComplexDO complexDO;

    public EchoServiceClient() {
        String host = System.getProperty("server.host", "localhost");
        int port = Integer.valueOf(System.getProperty("server.port", "8080"));
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext(true)
                .build();
        blockingStub = GreeterGrpc.newBlockingStub(channel);
        String string1 = "A man was going to the house of some rich person. As he went along the road, he saw a box of good apples at the side of the road. He said, I do not want to eat those apples; for the rich man will give me much food; he will give me very nice food to eat. Then he took the apples and threw them away into the dust.";
        String string2 = "An old woman had a cat. The cat was very old; she could not run quickly, and she could not bite, because she was so old. One day the old cat saw a mouse; she jumped and caught the mouse. But she could not bite it; so the mouse got out of her mouth and ran away, because the cat could not bite it";
        String string3 = "Then the old woman became very angry because the cat had not killed the mouse. She began to hit the cat. The cat said, Do not hit your old servant. I have worked for you for many years, and I would work for you still, but I am too old. Do not be unkind to the old, but remember what good work the old did when they were young.";
        ComplexDO.Builder ComplexDOOrBuilder=ComplexDO.newBuilder();
        ComplexDOOrBuilder.setIp("666.666.666.666");
        ComplexDOOrBuilder.setPfloat(10);
        ComplexDOOrBuilder.setPint(69);
        ComplexDOOrBuilder.setPlong(56);
        ComplexDOOrBuilder.setStringArray(0,string1);
        ComplexDOOrBuilder.setStringArray(1,string2);
        ComplexDOOrBuilder.setStringArray(2,string3);
        this.complexDO= ComplexDOOrBuilder.build();
    }


    @Override
    public void destroy() {
        try {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object echoComplexDO(Object object) {
        Object reponse = blockingStub.echoComplexDO((ComplexDO)object);
        return reponse;
    }


    @Override
    public Object getComplexDO() {
        return  complexDO;
    }

}
