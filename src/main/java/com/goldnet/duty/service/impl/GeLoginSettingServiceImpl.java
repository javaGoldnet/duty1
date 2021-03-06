package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeLoginSetting;
import com.goldnet.duty.service.GeLoginSettingService;
import com.goldnet.duty.mapper.GeLoginSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_login_setting(登陆安全设置)】的数据库操作Service实现
* @createDate 2022-03-11 16:35:54
*/
@Service
public class GeLoginSettingServiceImpl extends ServiceImpl<GeLoginSettingMapper, GeLoginSetting>
    implements GeLoginSettingService{

}




