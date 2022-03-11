package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.PromotionFeeSetting;
import generator.service.PromotionFeeSettingService;
import generator.mapper.PromotionFeeSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【promotion_fee_setting(推广费用设定表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class PromotionFeeSettingServiceImpl extends ServiceImpl<PromotionFeeSettingMapper, PromotionFeeSetting>
    implements PromotionFeeSettingService{

}




