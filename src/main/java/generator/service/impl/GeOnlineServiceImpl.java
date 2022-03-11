package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeOnline;
import generator.service.GeOnlineService;
import generator.mapper.GeOnlineMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_online(在线统计)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeOnlineServiceImpl extends ServiceImpl<GeOnlineMapper, GeOnline>
    implements GeOnlineService{

}




