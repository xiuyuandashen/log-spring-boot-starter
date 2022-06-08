package org.zlf.log.starter.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zlf.log.starter.annotation.Log;
import org.zlf.log.starter.service.SysLogService;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: zlf
 * @Date: 2022/01/12/22:32
 * @Description:
 */
@Aspect
@Component
public class LogAspect {

    @Autowired
    SysLogService sysLogService;

    @Pointcut("@annotation(org.zlf.log.starter.annotation.Log)")
    public void logPointCut(){}

    @AfterReturning(pointcut = "logPointCut()")
    public void doAfter(JoinPoint joinPoint){
        /**
         * 解析Log注解
         */
        String methodName = joinPoint.getSignature().getName();
        Method method = currentMethod(joinPoint,methodName);
        Log log = method.getAnnotation(Log.class);
        sysLogService.put(joinPoint,methodName,log.module(),log.description());
    }

    /**
     * 获取当前执行的方法
     *
     * @param joinPoint  连接点
     * @param methodName 方法名称
     * @return 方法
     */
    private Method currentMethod(JoinPoint joinPoint, String methodName) {
        /**
         * 获取目标类的所有方法，找到当前要执行的方法
         */
        Method[] methods = joinPoint.getTarget().getClass().getMethods();
        Method resultMethod = null;
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                resultMethod = method;
                break;
            }
        }
        return resultMethod;
    }
}
