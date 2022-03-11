package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.PromotionRebateSetting;
import generator.service.PromotionRebateSettingService;
import generator.mapper.PromotionRebateSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【promotion_rebate_setting(推广用户返点设置表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class PromotionRebateSettingServiceImpl extends ServiceImpl<PromotionRebateSettingMapper, PromotionRebateSetting>
    implements PromotionRebateSettingService{

}




