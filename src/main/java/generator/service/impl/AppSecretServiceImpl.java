package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AppSecret;
import generator.service.AppSecretService;
import generator.mapper.AppSecretMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_secret】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AppSecretServiceImpl extends ServiceImpl<AppSecretMapper, AppSecret>
    implements AppSecretService{

}




