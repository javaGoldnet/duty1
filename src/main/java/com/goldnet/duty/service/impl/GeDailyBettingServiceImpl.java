package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeDailyBetting;
import generator.service.GeDailyBettingService;
import generator.mapper.GeDailyBettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_daily_betting(会员每天打码量汇总)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeDailyBettingServiceImpl extends ServiceImpl<GeDailyBettingMapper, GeDailyBetting>
    implements GeDailyBettingService{

}




