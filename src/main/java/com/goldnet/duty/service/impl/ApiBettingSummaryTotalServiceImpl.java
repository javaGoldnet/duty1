package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ApiBettingSummaryTotal;
import generator.service.ApiBettingSummaryTotalService;
import generator.mapper.ApiBettingSummaryTotalMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_betting_summary_total(会员某一天的打码量按平台汇总表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:07
*/
@Service
public class ApiBettingSummaryTotalServiceImpl extends ServiceImpl<ApiBettingSummaryTotalMapper, ApiBettingSummaryTotal>
    implements ApiBettingSummaryTotalService{

}




