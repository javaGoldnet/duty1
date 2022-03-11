package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysResource;
import generator.service.SysResourceService;
import generator.mapper.SysResourceMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_resource(总控系统资源表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class SysResourceServiceImpl extends ServiceImpl<SysResourceMapper, SysResource>
    implements SysResourceService{

}




