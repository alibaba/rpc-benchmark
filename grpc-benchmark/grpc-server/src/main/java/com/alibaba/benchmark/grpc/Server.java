package com.alibaba.benchmark.grpc;

import com.alibaba.benchmark.grpc.GreeterGrpc;
import com.alibaba.benchmark.grpc.impl.GreeterImpl;

import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;


public class Server {
    private static final Logger logger = Logger.getLogger(Server.class.getName());

    private io.grpc.Server server;

    private void start(int port) throws IOException {
        server = ServerBuilder
                .forPort(port)
                .addService(GreeterGrpc.bindService(new GreeterImpl()))
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            Server.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }


    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final Server server = new Server();
        int port = Integer.valueOf(System.getProperty("server.port", "8080"));
        server.start(port);
        server.blockUntilShutdown();
    }

}