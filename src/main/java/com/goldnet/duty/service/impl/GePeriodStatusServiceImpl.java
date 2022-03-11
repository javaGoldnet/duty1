package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GePeriodStatus;
import generator.service.GePeriodStatusService;
import generator.mapper.GePeriodStatusMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_period_status(期数停售表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:12
*/
@Service
public class GePeriodStatusServiceImpl extends ServiceImpl<GePeriodStatusMapper, GePeriodStatus>
    implements GePeriodStatusService{

}




