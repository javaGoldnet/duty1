package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ApiTrunpointLog;
import generator.service.ApiTrunpointLogService;
import generator.mapper.ApiTrunpointLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_trunpoint_log(额度转换流程记录)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class ApiTrunpointLogServiceImpl extends ServiceImpl<ApiTrunpointLogMapper, ApiTrunpointLog>
    implements ApiTrunpointLogService{

}




