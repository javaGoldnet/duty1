package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.VasUserRole;
import generator.service.VasUserRoleService;
import generator.mapper.VasUserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【vas_user_role(使用者角色對應表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:19
*/
@Service
public class VasUserRoleServiceImpl extends ServiceImpl<VasUserRoleMapper, VasUserRole>
    implements VasUserRoleService{

}




