package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AtAccount;
import generator.service.AtAccountService;
import generator.mapper.AtAccountMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_account(账户表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AtAccountServiceImpl extends ServiceImpl<AtAccountMapper, AtAccount>
    implements AtAccountService{

}




