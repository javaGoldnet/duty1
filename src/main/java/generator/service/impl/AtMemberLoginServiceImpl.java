package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AtMemberLogin;
import generator.service.AtMemberLoginService;
import generator.mapper.AtMemberLoginMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_member_login(登录信息扩展表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class AtMemberLoginServiceImpl extends ServiceImpl<AtMemberLoginMapper, AtMemberLogin>
    implements AtMemberLoginService{

}




