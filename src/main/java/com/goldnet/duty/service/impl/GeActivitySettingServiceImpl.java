package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeActivitySetting;
import generator.service.GeActivitySettingService;
import generator.mapper.GeActivitySettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_activity_setting(活动设置表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeActivitySettingServiceImpl extends ServiceImpl<GeActivitySettingMapper, GeActivitySetting>
    implements GeActivitySettingService{

}




