package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysRole;
import generator.service.SysRoleService;
import generator.mapper.SysRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_role(总控系统角色表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole>
    implements SysRoleService{

}




