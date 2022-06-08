package org.zlf.log.starter.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableCharset;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableEngine;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlCharsetConstant;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlEngineConstant;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;


import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zlf
 * @since 2022-01-12
 */
@Table(value = "sys_log",comment = "操作日志类")
@TableCharset(MySqlCharsetConstant.UTF8)
@TableEngine(MySqlEngineConstant.InnoDB)
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志id
     */
    @TableId(value = "log_id", type = IdType.AUTO)
    @Column(name = "log_id",type = MySqlTypeConstant.BIGINT,comment = "日志id",isKey = true,isAutoIncrement = true)
    private Long logId;

    /**
     * 模块名称
     */
    @Column(name = "log_module",type = MySqlTypeConstant.VARCHAR,comment = "模块名称")
    private String logModule;

    /**
     * 日志内容
     */
    @Column(name = "log_content",type = MySqlTypeConstant.LONGTEXT,comment = "日志内容")
    private String logContent;

    /**
     * 日志描述
     */
    @Column(name = "log_description",type = MySqlTypeConstant.VARCHAR,comment = "日志描述")
    private String logDescription;

    /**
     * 操作用户ip
     */
    @Column(name = "log_operation_ip",type = MySqlTypeConstant.VARCHAR,comment = "操作用户ip")
    private String logOperationIp;

    /**
     * 操作用户名
     */
    @Column(name = "log_username",type = MySqlTypeConstant.VARCHAR,comment = "操作用户名")
    private String logUsername;

    /**
     * 操作时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Column(name = "log_date",type = MySqlTypeConstant.DATETIME,comment = "操作时间")
    private Date logDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getLogModule() {
        return logModule;
    }

    public void setLogModule(String logModule) {
        this.logModule = logModule;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public String getLogDescription() {
        return logDescription;
    }

    public void setLogDescription(String logDescription) {
        this.logDescription = logDescription;
    }

    public String getLogOperationIp() {
        return logOperationIp;
    }

    public void setLogOperationIp(String logOperationIp) {
        this.logOperationIp = logOperationIp;
    }

    public String getLogUsername() {
        return logUsername;
    }

    public void setLogUsername(String logUsername) {
        this.logUsername = logUsername;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }
}
