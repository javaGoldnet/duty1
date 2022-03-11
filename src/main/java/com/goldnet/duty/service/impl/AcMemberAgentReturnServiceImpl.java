package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AcMemberAgentReturn;
import generator.service.AcMemberAgentReturnService;
import generator.mapper.AcMemberAgentReturnMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ac_member_agent_return(会员与代理退水设定表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:07
*/
@Service
public class AcMemberAgentReturnServiceImpl extends ServiceImpl<AcMemberAgentReturnMapper, AcMemberAgentReturn>
    implements AcMemberAgentReturnService{

}




