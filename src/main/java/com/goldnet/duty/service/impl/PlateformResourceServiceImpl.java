package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.PlateformResource;
import generator.service.PlateformResourceService;
import generator.mapper.PlateformResourceMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【plateform_resource(平台资源表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class PlateformResourceServiceImpl extends ServiceImpl<PlateformResourceMapper, PlateformResource>
    implements PlateformResourceService{

}




