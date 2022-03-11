package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeActivityPacketTime;
import generator.service.GeActivityPacketTimeService;
import generator.mapper.GeActivityPacketTimeMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_activity_packet_time(红包活动时间段表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeActivityPacketTimeServiceImpl extends ServiceImpl<GeActivityPacketTimeMapper, GeActivityPacketTime>
    implements GeActivityPacketTimeService{

}




