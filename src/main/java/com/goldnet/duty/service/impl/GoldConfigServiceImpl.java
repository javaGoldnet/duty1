package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GoldConfig;
import generator.service.GoldConfigService;
import generator.mapper.GoldConfigMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【gold_config(系统配置文件表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:12
*/
@Service
public class GoldConfigServiceImpl extends ServiceImpl<GoldConfigMapper, GoldConfig>
    implements GoldConfigService{

}




