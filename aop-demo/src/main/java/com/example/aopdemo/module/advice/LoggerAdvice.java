package com.example.aopdemo.module.advice;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @ClassName LoggerAdvice
 * @Description 日志切面
 * @Author yuanyuan.wang
 * @Date 2020/3/31 19:38
 * @Version 1.0
 */
@Component
public class LoggerAdvice {

    public void doAround(ProceedingJoinPoint pjp) {
        //获取方法名
        Signature signature = pjp.getSignature();
        Object[] args = pjp.getArgs();

        if (args != null && args.length != 0 ) {

            System.out.println("LoggerAdvice," + "执行方法:" + signature.getName() + "参数：" + JSON.toJSONString(args));
        }

    }
}
