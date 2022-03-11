package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ApiBettingGameSummary;
import generator.service.ApiBettingGameSummaryService;
import generator.mapper.ApiBettingGameSummaryMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_betting_game_summary(厅主某一天的打码量、有效投注。损益按游戏汇总表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:07
*/
@Service
public class ApiBettingGameSummaryServiceImpl extends ServiceImpl<ApiBettingGameSummaryMapper, ApiBettingGameSummary>
    implements ApiBettingGameSummaryService{

}




