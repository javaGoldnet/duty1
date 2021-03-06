package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeRunTime;
import com.goldnet.duty.service.GeRunTimeService;
import com.goldnet.duty.mapper.GeRunTimeMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_run_time(定时任务站点运行时间表)】的数据库操作Service实现
* @createDate 2022-03-11 16:35:54
*/
@Service
public class GeRunTimeServiceImpl extends ServiceImpl<GeRunTimeMapper, GeRunTime>
    implements GeRunTimeService{

}




