package com.example.demo.method;

import com.example.demo.anno.Anno;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/4/10 14:44
 * @Version 1.0
 */
public class TestMethod {



    @Anno
    public void methodOne() {
        System.out.println("this is method one");
        methodTwo();
    }


    @Anno
    public void methodTwo() {
        System.out.println("this is method two");
    }

}
