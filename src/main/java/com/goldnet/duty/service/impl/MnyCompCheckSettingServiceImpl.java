package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.MnyCompCheckSetting;
import generator.service.MnyCompCheckSettingService;
import generator.mapper.MnyCompCheckSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【mny_comp_check_setting(公司入款，存放第三方不相关的设定，临时表，可在生成mny_check数据后删除)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:13
*/
@Service
public class MnyCompCheckSettingServiceImpl extends ServiceImpl<MnyCompCheckSettingMapper, MnyCompCheckSetting>
    implements MnyCompCheckSettingService{

}




