package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.MnyMerchantLevel;
import generator.service.MnyMerchantLevelService;
import generator.mapper.MnyMerchantLevelMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【mny_merchant_level(商家号与层级关联表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:13
*/
@Service
public class MnyMerchantLevelServiceImpl extends ServiceImpl<MnyMerchantLevelMapper, MnyMerchantLevel>
    implements MnyMerchantLevelService{

}




