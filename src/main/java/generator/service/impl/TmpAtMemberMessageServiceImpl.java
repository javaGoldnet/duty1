package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.TmpAtMemberMessage;
import generator.service.TmpAtMemberMessageService;
import generator.mapper.TmpAtMemberMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【tmp_at_member_message】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class TmpAtMemberMessageServiceImpl extends ServiceImpl<TmpAtMemberMessageMapper, TmpAtMemberMessage>
    implements TmpAtMemberMessageService{

}




