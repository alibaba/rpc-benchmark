package com.alibaba.benchmark.thrift;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import java.io.Closeable;
import java.io.IOException;

/**
 * @author linqiuping
 */
public class ThriftUService implements Closeable {

	public final TTransport transport;
	public final TProtocol protocol;
	public final ComplexDoService.Client client;

	public ThriftUService(String host, int port) {
		transport = new TFramedTransport(new TSocket(host, port));
		protocol = new TCompactProtocol(transport);
		client = new ComplexDoService.Client(protocol);

		try {
			transport.open();
		} catch (TTransportException e) {
			throw new Error(e);
		}
	}

	@Override
	public void close() throws IOException {
		transport.close();
	}

}
