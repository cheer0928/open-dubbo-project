package com.itheima.spi.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;

import org.junit.jupiter.api.Test;

/**
 * @description
 * @author: ts
 * @create:2021-05-27 16:57
 */
public class DubboSpiTest {

    //测试dubbo spi机制
    @Test
    public  void sayHello() throws Exception {
        //1、获得接口的ExtentionLoader
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        //2、根据指定的名字获(key)取对应的实例
        Robot robot = extensionLoader.getExtension("optimusPrime");
        robot.sayHello();
        /*Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();*/
        Robot robot2 = extensionLoader.getDefaultExtension();
        robot2.sayHello();
    }
}
