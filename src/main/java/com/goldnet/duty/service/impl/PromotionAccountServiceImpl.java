package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.PromotionAccount;
import generator.service.PromotionAccountService;
import generator.mapper.PromotionAccountMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【promotion_account(推广用户表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class PromotionAccountServiceImpl extends ServiceImpl<PromotionAccountMapper, PromotionAccount>
    implements PromotionAccountService{

}




