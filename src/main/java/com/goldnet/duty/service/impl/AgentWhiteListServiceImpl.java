package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AgentWhiteList;
import generator.service.AgentWhiteListService;
import generator.mapper.AgentWhiteListMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【agent_white_list】的数据库操作Service实现
* @createDate 2022-03-11 15:55:07
*/
@Service
public class AgentWhiteListServiceImpl extends ServiceImpl<AgentWhiteListMapper, AgentWhiteList>
    implements AgentWhiteListService{

}




