package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.TpsCheck;
import generator.service.TpsCheckService;
import generator.mapper.TpsCheckMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【tps_check(稽核表，保存第三方相关的稽核数据)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:18
*/
@Service
public class TpsCheckServiceImpl extends ServiceImpl<TpsCheckMapper, TpsCheck>
    implements TpsCheckService{

}




