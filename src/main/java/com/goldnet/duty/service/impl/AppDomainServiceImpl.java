package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AppDomain;
import generator.service.AppDomainService;
import generator.mapper.AppDomainMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_domain(app和webapp管理)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AppDomainServiceImpl extends ServiceImpl<AppDomainMapper, AppDomain>
    implements AppDomainService{

}




