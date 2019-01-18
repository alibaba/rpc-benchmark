namespace java com.alibaba.benchmark.thrift
 
struct ComPlexDO {
	1: i32 pint,
	2: i64 plong,
	3: double pfloat,
	4: list<i64> longArray,
	5: list<string> stringArray,
	6: string ip,
}


service ComplexDoService {

	ComPlexDO echoComplexDO(1: ComPlexDO comPlexDO),

}