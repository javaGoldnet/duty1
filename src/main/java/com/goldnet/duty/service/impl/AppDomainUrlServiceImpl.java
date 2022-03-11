package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AppDomainUrl;
import generator.service.AppDomainUrlService;
import generator.mapper.AppDomainUrlMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_domain_url(app域名列表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AppDomainUrlServiceImpl extends ServiceImpl<AppDomainUrlMapper, AppDomainUrl>
    implements AppDomainUrlService{

}




