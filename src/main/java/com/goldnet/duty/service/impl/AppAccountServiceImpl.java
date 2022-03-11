package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AppAccount;
import generator.service.AppAccountService;
import generator.mapper.AppAccountMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_account】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AppAccountServiceImpl extends ServiceImpl<AppAccountMapper, AppAccount>
    implements AppAccountService{

}




