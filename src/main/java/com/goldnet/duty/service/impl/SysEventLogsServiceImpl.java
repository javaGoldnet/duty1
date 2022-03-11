package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysEventLogs;
import generator.service.SysEventLogsService;
import generator.mapper.SysEventLogsMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_event_logs】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class SysEventLogsServiceImpl extends ServiceImpl<SysEventLogsMapper, SysEventLogs>
    implements SysEventLogsService{

}




