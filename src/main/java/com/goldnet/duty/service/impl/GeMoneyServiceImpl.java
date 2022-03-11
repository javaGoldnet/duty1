package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeMoney;
import generator.service.GeMoneyService;
import generator.mapper.GeMoneyMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_money(金钱(会员平台显示余额))】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeMoneyServiceImpl extends ServiceImpl<GeMoneyMapper, GeMoney>
    implements GeMoneyService{

}




