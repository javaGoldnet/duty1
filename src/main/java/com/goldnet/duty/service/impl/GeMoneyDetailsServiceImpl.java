package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeMoneyDetails;
import generator.service.GeMoneyDetailsService;
import generator.mapper.GeMoneyDetailsMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_money_details(金钱流水（用于投注、结算操作余额）)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeMoneyDetailsServiceImpl extends ServiceImpl<GeMoneyDetailsMapper, GeMoneyDetails>
    implements GeMoneyDetailsService{

}




