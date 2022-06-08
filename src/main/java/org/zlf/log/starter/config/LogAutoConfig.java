package org.zlf.log.starter.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// 扫描 mybatis.actable
@ComponentScan(basePackages = {"org.zlf.log.starter","com.gitee.sunchenbin.mybatis.actable.manager.*"})
// 配置mybatis扫描actable的mapper以及本模块的mapper
@MapperScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.dao.*","org.zlf.log.starter.mapper"} )
public class LogAutoConfig {

}
