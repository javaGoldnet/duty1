package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysUserLog;
import generator.service.SysUserLogService;
import generator.mapper.SysUserLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_user_log(总控操作日志表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class SysUserLogServiceImpl extends ServiceImpl<SysUserLogMapper, SysUserLog>
    implements SysUserLogService{

}




