package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AtMemberMessage;
import generator.service.AtMemberMessageService;
import generator.mapper.AtMemberMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_member_message(会员资料表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class AtMemberMessageServiceImpl extends ServiceImpl<AtMemberMessageMapper, AtMemberMessage>
    implements AtMemberMessageService{

}




