package com.alibaba.benchmark.dubbo.impl;

import com.alibaba.benchmark.bean.ComplexDO;
import com.alibaba.benchmark.service.EchoService;

/**
 * @author linqiuping
 */
public class EchoServiceImpl implements EchoService {


    ComplexDO complexDO;

    public EchoServiceImpl(){
        this.complexDO=ComplexDO.getComplexDO();
    }


    @Override
    public Object echoComplexDO(Object Object) {
        return Object;
    }

    @Override
    public Object getComplexDO() {
        return  complexDO;
    }
}
