package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeDailyDeposit;
import generator.service.GeDailyDepositService;
import generator.mapper.GeDailyDepositMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_daily_deposit(会员每天存款汇总)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeDailyDepositServiceImpl extends ServiceImpl<GeDailyDepositMapper, GeDailyDeposit>
    implements GeDailyDepositService{

}




