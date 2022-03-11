package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeLoginSetting;
import generator.service.GeLoginSettingService;
import generator.mapper.GeLoginSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_login_setting(登陆安全设置)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeLoginSettingServiceImpl extends ServiceImpl<GeLoginSettingMapper, GeLoginSetting>
    implements GeLoginSettingService{

}




