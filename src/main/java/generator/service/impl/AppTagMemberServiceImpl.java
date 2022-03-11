package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AppTagMember;
import generator.service.AppTagMemberService;
import generator.mapper.AppTagMemberMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_tag_member】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AppTagMemberServiceImpl extends ServiceImpl<AppTagMemberMapper, AppTagMember>
    implements AppTagMemberService{

}




