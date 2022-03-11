package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.MnyCurrency;
import generator.service.MnyCurrencyService;
import generator.mapper.MnyCurrencyMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【mny_currency】的数据库操作Service实现
* @createDate 2022-03-11 15:55:13
*/
@Service
public class MnyCurrencyServiceImpl extends ServiceImpl<MnyCurrencyMapper, MnyCurrency>
    implements MnyCurrencyService{

}




