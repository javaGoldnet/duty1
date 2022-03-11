package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.PayMoneySetting;
import generator.service.PayMoneySettingService;
import generator.mapper.PayMoneySettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【pay_money_setting】的数据库操作Service实现
* @createDate 2022-03-11 15:55:14
*/
@Service
public class PayMoneySettingServiceImpl extends ServiceImpl<PayMoneySettingMapper, PayMoneySetting>
    implements PayMoneySettingService{

}




