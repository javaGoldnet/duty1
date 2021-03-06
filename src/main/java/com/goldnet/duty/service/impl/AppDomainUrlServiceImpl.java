package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.AppDomainUrl;
import com.goldnet.duty.service.AppDomainUrlService;
import com.goldnet.duty.mapper.AppDomainUrlMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_domain_url(app域名列表)】的数据库操作Service实现
* @createDate 2022-03-11 16:35:51
*/
@Service
public class AppDomainUrlServiceImpl extends ServiceImpl<AppDomainUrlMapper, AppDomainUrl>
    implements AppDomainUrlService{

}




