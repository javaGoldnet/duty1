package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.DbaError;
import generator.service.DbaErrorService;
import generator.mapper.DbaErrorMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【dba_error】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class DbaErrorServiceImpl extends ServiceImpl<DbaErrorMapper, DbaError>
    implements DbaErrorService{

}




