package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ApiLoginLog;
import generator.service.ApiLoginLogService;
import generator.mapper.ApiLoginLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_login_log】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class ApiLoginLogServiceImpl extends ServiceImpl<ApiLoginLogMapper, ApiLoginLog>
    implements ApiLoginLogService{

}




