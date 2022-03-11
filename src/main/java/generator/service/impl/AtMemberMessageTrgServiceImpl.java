package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AtMemberMessageTrg;
import generator.service.AtMemberMessageTrgService;
import generator.mapper.AtMemberMessageTrgMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_member_message_trg(用于监控我们的会员资料表的变更情况，会对update和delete操作进行触发进来)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class AtMemberMessageTrgServiceImpl extends ServiceImpl<AtMemberMessageTrgMapper, AtMemberMessageTrg>
    implements AtMemberMessageTrgService{

}




