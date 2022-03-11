package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysTask;
import generator.service.SysTaskService;
import generator.mapper.SysTaskMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_task(任务信息表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class SysTaskServiceImpl extends ServiceImpl<SysTaskMapper, SysTask>
    implements SysTaskService{

}




