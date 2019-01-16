package com.alibaba.benchmark.grpc.impl;

import com.alibaba.benchmark.grpc.ComplexDO;
import com.alibaba.benchmark.grpc.GreeterGrpc;

import io.grpc.stub.StreamObserver;

/**
 * @author guanghao on 2019/1/1.
 */
public class GreeterImpl implements GreeterGrpc.Greeter {

    @Override
    public void echoComplexDO(ComplexDO request, StreamObserver<ComplexDO> responseObserver) {
        responseObserver.onNext(request);
        responseObserver.onCompleted();
    }

    @Override
    public void echoComplexDOByServerSideStream(ComplexDO request, StreamObserver<ComplexDO> responseObserver) {
        System.out.println(request.getIp());
        responseObserver.onNext(request);
        responseObserver.onCompleted();

    }

    @Override
    public StreamObserver<ComplexDO> echoComplexDOByClientSideStream(StreamObserver<ComplexDO> responseObserver) {

        return null;
    }

    @Override
    public StreamObserver<ComplexDO> echoComplexDOByBidirectionalStream(StreamObserver<ComplexDO> responseObserver) {
        return null;
    }


}
