package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeLoginPasswordSetting;
import generator.service.GeLoginPasswordSettingService;
import generator.mapper.GeLoginPasswordSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_login_password_setting】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeLoginPasswordSettingServiceImpl extends ServiceImpl<GeLoginPasswordSettingMapper, GeLoginPasswordSetting>
    implements GeLoginPasswordSettingService{

}




