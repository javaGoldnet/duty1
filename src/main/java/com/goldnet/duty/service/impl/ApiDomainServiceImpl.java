package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ApiDomain;
import generator.service.ApiDomainService;
import generator.mapper.ApiDomainMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_domain】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class ApiDomainServiceImpl extends ServiceImpl<ApiDomainMapper, ApiDomain>
    implements ApiDomainService{

}




