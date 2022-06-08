package org.zlf.log.starter.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.zlf.log.starter.entity.SysLog;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zlf
 * @since 2022-01-12
 */
@Repository
@Mapper
public interface SysLogMapper extends BaseMapper<SysLog> {

}
