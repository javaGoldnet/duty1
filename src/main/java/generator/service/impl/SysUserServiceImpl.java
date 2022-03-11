package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysUser;
import generator.service.SysUserService;
import generator.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_user(系统用户表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




