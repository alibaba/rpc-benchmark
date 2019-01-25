package com.alibaba.benchmark;

import com.alibaba.benchmark.bean.ComplexDO;
import com.alibaba.benchmark.rpc.AbstractClient;
import com.alibaba.benchmark.service.EchoService;
import com.alibaba.benchmark.service.ResourceService;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.ChainedOptionsBuilder;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class Client extends AbstractClient {

    private final ClassPathXmlApplicationContext context;
    private final ClassPathXmlApplicationContext resourceServiceContext;
    private final EchoService echoService;
    private final ResourceService resourceService;

    public Client() {
        context = new ClassPathXmlApplicationContext("consumer.xml");
        resourceServiceContext = new ClassPathXmlApplicationContext("resourceService.xml");
        context.start();
        echoService = (EchoService) context.getBean("echoService");
        resourceService = (ResourceService) resourceServiceContext.getBean("resourceService");
    }


    @Override
    public EchoService getEchoService() {
        return echoService;
    }

    @TearDown
    public void close() throws IOException {
        resourceService.destroy();
        context.close();
        resourceServiceContext.close();
    }


    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.SECONDS)
    public Object echoComplexDO() throws Exception {
        return super.echoComplexDO();
    }


    public static void main(String[] args) throws Exception {
        Options opt;
        ChainedOptionsBuilder optBuilder = new OptionsBuilder()
                .include(Client.class.getSimpleName());
        opt = doOptions(optBuilder).build();
        new Runner(opt).run();
    }

    private static ChainedOptionsBuilder doOptions(ChainedOptionsBuilder optBuilder) {
        String output = System.getProperty("benchmark.output");
        if (output != null && !output.trim().isEmpty()) {
            optBuilder.output(output);
        }

        optBuilder.threads(getIntFromSystemProperties("benchmark.concurrency", 32))
                .warmupIterations(getIntFromSystemProperties("benchmark.warm.up.iterations", 3))
                .warmupTime(TimeValue.seconds(getIntFromSystemProperties("benchmark.warm.up.time", 10)))
                .measurementIterations(getIntFromSystemProperties("benchmark.measurement.iterations", 3))
                .measurementTime(TimeValue.seconds(getIntFromSystemProperties("benchmark.measurement.time", 3)))
                .forks(getIntFromSystemProperties("benchmark.forks", 1));
        return optBuilder;
    }

    private static int getIntFromSystemProperties(String key, int defaultValue) {
        String property = System.getProperty(key);
        if (property != null && !property.trim().isEmpty()) {
            return Integer.valueOf(property);
        }
        return defaultValue;
    }
}
