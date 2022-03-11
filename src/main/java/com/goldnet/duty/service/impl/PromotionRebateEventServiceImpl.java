package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.PromotionRebateEvent;
import generator.service.PromotionRebateEventService;
import generator.mapper.PromotionRebateEventMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【promotion_rebate_event(推广返点事件表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class PromotionRebateEventServiceImpl extends ServiceImpl<PromotionRebateEventMapper, PromotionRebateEvent>
    implements PromotionRebateEventService{

}




