package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AtAgentMessage;
import generator.service.AtAgentMessageService;
import generator.mapper.AtAgentMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_agent_message(代理商资料信息)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class AtAgentMessageServiceImpl extends ServiceImpl<AtAgentMessageMapper, AtAgentMessage>
    implements AtAgentMessageService{

}




