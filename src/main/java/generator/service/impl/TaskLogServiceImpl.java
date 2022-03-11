package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.TaskLog;
import generator.service.TaskLogService;
import generator.mapper.TaskLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【task_log】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class TaskLogServiceImpl extends ServiceImpl<TaskLogMapper, TaskLog>
    implements TaskLogService{

}




