package com.itheima.spi.dubbo;

import org.apache.dubbo.common.extension.SPI;

@SPI("bumblebee") //bumblebee表示默认加载该对象实例
public interface Robot {

    void sayHello();
}
