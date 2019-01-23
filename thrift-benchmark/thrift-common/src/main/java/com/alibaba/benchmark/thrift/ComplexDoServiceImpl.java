package com.alibaba.benchmark.thrift;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.thrift.TException;

public class ComplexDoServiceImpl implements ComplexDoService.Iface{

    Log log=LogFactory.getLog(ComplexDoServiceImpl.class);
    @Override
    public ComPlexDO echoComplexDO(ComPlexDO comPlexDO) throws TException {
        System.out.println("haha");
        return comPlexDO;
    }
}
