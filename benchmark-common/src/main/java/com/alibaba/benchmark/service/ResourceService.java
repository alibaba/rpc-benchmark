package com.alibaba.benchmark.service;

import java.io.IOException;

/**
 * manage resource
 *
 * @author lynn.lqp on 2018/12/25.
 */
public interface ResourceService {
    void destroy() throws IOException;
}
