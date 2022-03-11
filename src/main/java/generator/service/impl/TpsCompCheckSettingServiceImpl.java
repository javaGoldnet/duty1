package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.TpsCompCheckSetting;
import generator.service.TpsCompCheckSettingService;
import generator.mapper.TpsCompCheckSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【tps_comp_check_setting(公司入款，存放第三方相关的设定，临时表，可在生成mny_check数据后删除)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:18
*/
@Service
public class TpsCompCheckSettingServiceImpl extends ServiceImpl<TpsCompCheckSettingMapper, TpsCompCheckSetting>
    implements TpsCompCheckSettingService{

}




