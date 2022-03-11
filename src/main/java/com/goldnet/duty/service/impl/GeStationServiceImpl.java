package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeStation;
import generator.service.GeStationService;
import generator.mapper.GeStationMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_station(子站信息)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:12
*/
@Service
public class GeStationServiceImpl extends ServiceImpl<GeStationMapper, GeStation>
    implements GeStationService{

}




