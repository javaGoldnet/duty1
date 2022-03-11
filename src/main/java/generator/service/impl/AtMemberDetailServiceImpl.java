package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AtMemberDetail;
import generator.service.AtMemberDetailService;
import generator.mapper.AtMemberDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_member_detail(会员详情字段表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class AtMemberDetailServiceImpl extends ServiceImpl<AtMemberDetailMapper, AtMemberDetail>
    implements AtMemberDetailService{

}




