package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.PromotionReportRecord;
import generator.service.PromotionReportRecordService;
import generator.mapper.PromotionReportRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【promotion_report_record(报表历史记录表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class PromotionReportRecordServiceImpl extends ServiceImpl<PromotionReportRecordMapper, PromotionReportRecord>
    implements PromotionReportRecordService{

}




