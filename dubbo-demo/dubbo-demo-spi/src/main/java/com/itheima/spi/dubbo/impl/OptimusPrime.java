package com.itheima.spi.dubbo.impl;

import com.itheima.spi.dubbo.Robot;

import org.apache.dubbo.rpc.Protocol;

public class OptimusPrime implements Robot {


	private Protocol protocol;

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

	@Override
	public void sayHello() {
		System.out.println(protocol);
		System.out.println("Hello, I am Optimus Prime.");
	}
}
