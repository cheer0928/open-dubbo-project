package com.itheima.spi.dubbo.impl;

import com.itheima.spi.dubbo.Robot;

/**
 * @description
 * @author: ts
 * @create:2021-05-28 20:10
 */
public class RobotWrapper implements Robot {


    private Robot robot;

    public RobotWrapper(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void sayHello() {
        System.out.println("----提前准备----");
        robot.sayHello();
        System.out.println("----收尾工作----");
    }
}
