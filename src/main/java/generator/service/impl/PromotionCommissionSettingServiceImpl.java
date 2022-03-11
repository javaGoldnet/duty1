package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.PromotionCommissionSetting;
import generator.service.PromotionCommissionSettingService;
import generator.mapper.PromotionCommissionSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【promotion_commission_setting(推广佣金设定表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class PromotionCommissionSettingServiceImpl extends ServiceImpl<PromotionCommissionSettingMapper, PromotionCommissionSetting>
    implements PromotionCommissionSettingService{

}




