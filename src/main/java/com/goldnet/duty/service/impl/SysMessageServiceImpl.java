package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysMessage;
import generator.service.SysMessageService;
import generator.mapper.SysMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_message(发送消息记录表【暂时没用】)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:16
*/
@Service
public class SysMessageServiceImpl extends ServiceImpl<SysMessageMapper, SysMessage>
    implements SysMessageService{

}




