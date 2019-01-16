package com.alibaba.benchmark.dubbo.serialize;

import com.alibaba.benchmark.bean.BaseDO;
import com.alibaba.benchmark.bean.ComplexDO;
import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Arrays;
import java.util.Collection;

public class SerializationOptimizerImpl implements SerializationOptimizer {
    @Override
    public Collection<Class> getSerializableClasses() {
        return Arrays.asList(BaseDO.class, ComplexDO.class);
    }
}