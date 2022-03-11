package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AppJpushMessage;
import generator.service.AppJpushMessageService;
import generator.mapper.AppJpushMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_jpush_message】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AppJpushMessageServiceImpl extends ServiceImpl<AppJpushMessageMapper, AppJpushMessage>
    implements AppJpushMessageService{

}




