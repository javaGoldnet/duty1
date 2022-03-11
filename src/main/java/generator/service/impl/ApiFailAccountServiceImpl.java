package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ApiFailAccount;
import generator.service.ApiFailAccountService;
import generator.mapper.ApiFailAccountMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_fail_account】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class ApiFailAccountServiceImpl extends ServiceImpl<ApiFailAccountMapper, ApiFailAccount>
    implements ApiFailAccountService{

}




