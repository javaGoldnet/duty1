package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysWorstPassword;
import generator.service.SysWorstPasswordService;
import generator.mapper.SysWorstPasswordMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_worst_password(弱密码表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class SysWorstPasswordServiceImpl extends ServiceImpl<SysWorstPasswordMapper, SysWorstPassword>
    implements SysWorstPasswordService{

}




