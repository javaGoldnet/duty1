package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.CountPerionDaysLottery;
import generator.service.CountPerionDaysLotteryService;
import generator.mapper.CountPerionDaysLotteryMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【count_perion_days_lottery(用户单日彩种统计表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:10
*/
@Service
public class CountPerionDaysLotteryServiceImpl extends ServiceImpl<CountPerionDaysLotteryMapper, CountPerionDaysLottery>
    implements CountPerionDaysLotteryService{

}




