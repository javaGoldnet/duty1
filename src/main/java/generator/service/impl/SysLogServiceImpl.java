package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysLog;
import generator.service.SysLogService;
import generator.mapper.SysLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_log】的数据库操作Service实现
* @createDate 2022-03-11 15:55:16
*/
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog>
    implements SysLogService{

}




