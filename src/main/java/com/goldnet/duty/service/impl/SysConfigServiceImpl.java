package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysConfig;
import generator.service.SysConfigService;
import generator.mapper.SysConfigMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_config(系统参数配置表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig>
    implements SysConfigService{

}




