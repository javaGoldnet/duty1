package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AtAccountRecent;
import generator.service.AtAccountRecentService;
import generator.mapper.AtAccountRecentMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_account_recent(最近访问表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class AtAccountRecentServiceImpl extends ServiceImpl<AtAccountRecentMapper, AtAccountRecent>
    implements AtAccountRecentService{

}




