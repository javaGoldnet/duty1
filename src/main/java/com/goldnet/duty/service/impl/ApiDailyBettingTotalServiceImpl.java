package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ApiDailyBettingTotal;
import generator.service.ApiDailyBettingTotalService;
import generator.mapper.ApiDailyBettingTotalMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_daily_betting_total(会员每天的注单汇总数据表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class ApiDailyBettingTotalServiceImpl extends ServiceImpl<ApiDailyBettingTotalMapper, ApiDailyBettingTotal>
    implements ApiDailyBettingTotalService{

}




