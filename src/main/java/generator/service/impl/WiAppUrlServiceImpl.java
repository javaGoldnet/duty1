package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.WiAppUrl;
import generator.service.WiAppUrlService;
import generator.mapper.WiAppUrlMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【wi_app_url(手机客户端下载地址表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:19
*/
@Service
public class WiAppUrlServiceImpl extends ServiceImpl<WiAppUrlMapper, WiAppUrl>
    implements WiAppUrlService{

}




