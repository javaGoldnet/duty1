package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeRunTime;
import generator.service.GeRunTimeService;
import generator.mapper.GeRunTimeMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_run_time(定时任务站点运行时间表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:12
*/
@Service
public class GeRunTimeServiceImpl extends ServiceImpl<GeRunTimeMapper, GeRunTime>
    implements GeRunTimeService{

}




