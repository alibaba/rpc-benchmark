package com.alibaba.benchmark.thrift;


import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.*;

import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author linqiuping
 * thrift server
 */
public class Server {

    public static void main(String[] args) {
        try {
            int port = Integer.valueOf(System.getProperty("server.port", "8088"));
            InetSocketAddress serverAddress = new InetSocketAddress("localhost", port);
            TNonblockingServerTransport serverSocket = new TNonblockingServerSocket(serverAddress);
            TThreadedSelectorServer.Args params = new TThreadedSelectorServer.Args(serverSocket);
            params.maxReadBufferBytes=1024*1024*100;
//            params.protocolFactory(new TBinaryProtocol.Factory());
            params.processor(new ComplexDoService.Processor<ComplexDoService.Iface>(new ComplexDoServiceImpl()));
            params.protocolFactory(new TCompactProtocol.Factory());
            params.selectorThreads=5;
            ExecutorService pool = Executors.newFixedThreadPool(5);
            params.executorService(pool);
            TThreadedSelectorServer server = new TThreadedSelectorServer(params);
            server.serve();
        }catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}
