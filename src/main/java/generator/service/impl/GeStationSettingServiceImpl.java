package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeStationSetting;
import generator.service.GeStationSettingService;
import generator.mapper.GeStationSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_station_setting(站点设置表（扩展表）)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:12
*/
@Service
public class GeStationSettingServiceImpl extends ServiceImpl<GeStationSettingMapper, GeStationSetting>
    implements GeStationSettingService{

}




