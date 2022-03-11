package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeLotterySeries;
import generator.service.GeLotterySeriesService;
import generator.mapper.GeLotterySeriesMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_lottery_series(彩票ID与系列ID关系表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeLotterySeriesServiceImpl extends ServiceImpl<GeLotterySeriesMapper, GeLotterySeries>
    implements GeLotterySeriesService{

}




