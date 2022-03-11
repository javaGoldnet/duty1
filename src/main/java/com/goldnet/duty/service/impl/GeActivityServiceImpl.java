package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeActivity;
import generator.service.GeActivityService;
import generator.mapper.GeActivityMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_activity(活动管理表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeActivityServiceImpl extends ServiceImpl<GeActivityMapper, GeActivity>
    implements GeActivityService{

}



