package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ApiSet;
import generator.service.ApiSetService;
import generator.mapper.ApiSetMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_set(API设置管理表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class ApiSetServiceImpl extends ServiceImpl<ApiSetMapper, ApiSet>
    implements ApiSetService{

}




