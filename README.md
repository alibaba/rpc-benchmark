# RPC Framework Benchmark

This project focuses on benchmarking and profiling common rpc frameworks such as DUBBO, GRPC, Thrift and so on. The code and the idea behinds it is inspired by [RPC Benchmark](https://github.com/hank-whu/rpc-benchmark) and [DUBBO Benchmark](https://github.com/dubbo/dubbo-benchmark).



## How To Run Benchmark in your desktop?

Clone this project onto your desktop, then

- Start the target server first, for example:

  ```
  ./benchmark dubbo/dubbo-kryo-server
  ```

- Start the corresponding client, for example:

  ```
  ./benchmark dubbo/dubbo-kryo-client
  ```

### How to Run Profiling

- Start the target server in profiling mode, for example:

  ```
  ./benchmark -m profiling dubbo/dubbo-kryo-server
  ```

- Start the corresponding client, for example:

  ```
  ./benchmark dubbo/dubbo-kryo-client
  ```

### Specify hostname, port and output file for service

```
./benchmark -s [hostname|ip address] -p port -f output 
```



### Specify more benchmark options

执行`benchmark usage`查看更多的配置：

```sh
command: [m|s|p|f|c|t|i|T|I|F]
         -m [profiling|benchmark], specify benchmark mode
         -s hostname, host name
         -p port, port number
         -f output file path
         -c concurrency
         -t time used for each warm up iteration
         -i iterations number for warm up
         -T time used for each measurement iteration
         -I iterations number for measurement
         -F forks number
dirname: test module name such like dubbo/dubbo-client
```



比如配置并发32，预热3次，每次10s，正式测试3次，每次10s, 以上流程，测试2轮，结果输出到 jmh.dat 也就是执行一次耗费 （3*10 + 3*10）* 2 = 120s，可使用下面的配置

```sh
./benchmark -c 32 -i 3 -t 10 -I 3 -T 10 -F 2 -p 8088 -f jmh.dat dubbo/dubbo-kryo-client
```



## How to run benchmark in aliyun environment

为了提供统一的测试环境，我们提供了购买阿里云机器（按照时长计费）、初始化环境和执行测试的脚本。机器的配置(TODO)如下：

- cpu:
- 内存：
- 网卡：

可以在`{product}/{product}-client/benchmark.yaml`文件中配置压测脚本，比如

```shell
-shell: 'sh /root/rpc-benchmark/benchmark -c 32 -i 3 -t 10 -I 3 -T 10 -F 2 -s  {{ server[0]  }}   -p 8088 -f jmh.json /root/rpc-benchmark/thrift-benchmark/thrift-client > thriftclient.log 
```



执行后，会在`./result/`目录得到benchmark结果

```
├── dubbo
│   ├── dubbo_fst.json
│   ├── dubbo_hessianlite.json
│   ├── dubbo_kryo.json
│   └── dubbo_native_hessian.json
├── grpc
│   └── grpc_benchmark.json
└── thrift
    └── thrift_benchmark.json
```

下面介绍如何在阿里云上自动购买机器到完成性能测试：

### 准备

- 安装ansible
- 安装terraform
  - MacOS：brew install terraform-inventory

### 购买机器

- 配置AK／SK

  `export ALICLOUD_ACCESS_KEY="XXXX"`，

  `export ALICLOUD_SECRET_KEY="XXXX"`

- 购买机器

  `terraform init`

  `terraform apply`

### 初始化环境

- 安装JDK,MVN,代码部署

  ansible-playbook initEnv.yaml --inventory=`which terraform-inventory` -u root

### 执行测试

- ansible-playbook initEnv.yaml --inventory=`which terraform-inventory` -u root





## 最新一轮的评测结果 TODO

- 时间：`todo`



### DUBBO



### GRPC



### Thrift 



## 开发者指南

### 代码结构



### 如何扩展其他RPC框架的测评？