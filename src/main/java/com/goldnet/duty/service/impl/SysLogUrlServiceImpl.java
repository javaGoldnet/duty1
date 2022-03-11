package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysLogUrl;
import generator.service.SysLogUrlService;
import generator.mapper.SysLogUrlMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_log_url(代理操作日志表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:16
*/
@Service
public class SysLogUrlServiceImpl extends ServiceImpl<SysLogUrlMapper, SysLogUrl>
    implements SysLogUrlService{

}




