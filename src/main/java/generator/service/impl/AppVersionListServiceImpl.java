package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AppVersionList;
import generator.service.AppVersionListService;
import generator.mapper.AppVersionListMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_version_list】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AppVersionListServiceImpl extends ServiceImpl<AppVersionListMapper, AppVersionList>
    implements AppVersionListService{

}




