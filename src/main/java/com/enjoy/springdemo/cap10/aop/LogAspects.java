package com.enjoy.springdemo.cap10.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/02/14 22:07
 */
@Aspect
public class LogAspects {
    @Pointcut("execution(public int com.enjoy.springdemo.cap10.aop.Calculator.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void logStart() {
        System.out.println("除法运行.....参数列表是：{}");
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("除法结束.....");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("除法正常返回.......运行结果是：{" + result + "}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("除法运行异常.......异常信息是：{" + exception + "}");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("@Arount:执行目标方法之前。。。");
        Object object = null;
        try {
            object = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("@Arount:执行目标方法之后。。。");
        return object;
    }
}
