package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/4/10 14:33
 * @Version 1.0
 */
public class TestAnnoAop {

    public Object test(final ProceedingJoinPoint param) throws Throwable {
        String methodName = param.getSignature().getName();
        System.out.print("-----------------------------------------------------" + methodName);
        return null;
    }

}
