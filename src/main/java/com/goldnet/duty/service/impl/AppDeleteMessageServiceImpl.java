package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AppDeleteMessage;
import generator.service.AppDeleteMessageService;
import generator.mapper.AppDeleteMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_delete_message】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AppDeleteMessageServiceImpl extends ServiceImpl<AppDeleteMessageMapper, AppDeleteMessage>
    implements AppDeleteMessageService{

}



