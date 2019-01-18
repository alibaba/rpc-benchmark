package com.alibaba.benchmark.thrift;

import org.apache.thrift.TException;
import com.alibaba.benchmark.thrift.ComplexDoService;
import com.alibaba.benchmark.thrift.ComPlexDO;


public class ComplexDoServiceImpl implements ComplexDoService.Iface{
    @Override
    public ComPlexDO echoComplexDO(ComPlexDO complexDO) throws TException {
        return complexDO;
    }

}
