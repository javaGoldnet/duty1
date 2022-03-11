package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.MnyLevelCurrency;
import generator.service.MnyLevelCurrencyService;
import generator.mapper.MnyLevelCurrencyMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【mny_level_currency(层级-币别-会员数量)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:13
*/
@Service
public class MnyLevelCurrencyServiceImpl extends ServiceImpl<MnyLevelCurrencyMapper, MnyLevelCurrency>
    implements MnyLevelCurrencyService{

}




