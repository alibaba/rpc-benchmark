package com.alibaba.benchmark.thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import com.alibaba.benchmark.thrift.ComplexDoService;

public class Server {

    /**
     * 启动thrift服务器
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.out.println("thrift server start....");
            TProcessor tprocessor = new ComplexDoService.Processor<ComplexDoService.Iface>(new ComplexDoServiceImpl());
            // 简单的单线程服务模型
            int port = Integer.valueOf(System.getProperty("server.port", "8080"));
            TServerSocket serverTransport = new TServerSocket(port);
            TServer.Args tArgs = new TServer.Args(serverTransport);
            tArgs.processor(tprocessor);
            tArgs.protocolFactory(new TBinaryProtocol.Factory());
            TServer server = new TSimpleServer(tArgs);
            server.serve();
        }catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}
