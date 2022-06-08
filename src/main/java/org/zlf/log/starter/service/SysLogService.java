package org.zlf.log.starter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.aspectj.lang.JoinPoint;
import org.zlf.log.starter.entity.SysLog;

public interface SysLogService extends IService<SysLog> {

    void put(JoinPoint joinPoint, String methodName, String module, String description);
}
