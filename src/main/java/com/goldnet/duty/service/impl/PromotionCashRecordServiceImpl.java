package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.PromotionCashRecord;
import generator.service.PromotionCashRecordService;
import generator.mapper.PromotionCashRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【promotion_cash_record(返佣现金流水总记录表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class PromotionCashRecordServiceImpl extends ServiceImpl<PromotionCashRecordMapper, PromotionCashRecord>
    implements PromotionCashRecordService{

}




