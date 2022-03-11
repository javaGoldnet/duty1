package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeLogin;
import generator.service.GeLoginService;
import generator.mapper.GeLoginMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_login(登录用户记录表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeLoginServiceImpl extends ServiceImpl<GeLoginMapper, GeLogin>
    implements GeLoginService{

}




