package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AppTag;
import generator.service.AppTagService;
import generator.mapper.AppTagMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_tag】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AppTagServiceImpl extends ServiceImpl<AppTagMapper, AppTag>
    implements AppTagService{

}




