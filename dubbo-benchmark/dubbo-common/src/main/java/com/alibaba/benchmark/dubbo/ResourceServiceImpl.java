package com.alibaba.benchmark.dubbo;

import com.alibaba.benchmark.service.ResourceService;
import com.alibaba.dubbo.config.ProtocolConfig;

/**
 * @author lynn.lqp on 2018/12/25.
 */
public class ResourceServiceImpl implements ResourceService {
    @Override
    public void destroy() {
        ProtocolConfig.destroyAll();
    }
}
