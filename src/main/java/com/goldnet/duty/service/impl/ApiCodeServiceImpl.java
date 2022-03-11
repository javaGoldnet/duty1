package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ApiCode;
import generator.service.ApiCodeService;
import generator.mapper.ApiCodeMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_code】的数据库操作Service实现
* @createDate 2022-03-11 15:55:07
*/
@Service
public class ApiCodeServiceImpl extends ServiceImpl<ApiCodeMapper, ApiCode>
    implements ApiCodeService{

}




