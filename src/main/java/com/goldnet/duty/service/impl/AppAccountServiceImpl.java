package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.AppAccount;
import com.goldnet.duty.service.AppAccountService;
import com.goldnet.duty.mapper.AppAccountMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_account】的数据库操作Service实现
* @createDate 2022-03-11 16:35:51
*/
@Service
public class AppAccountServiceImpl extends ServiceImpl<AppAccountMapper, AppAccount>
    implements AppAccountService{

}




