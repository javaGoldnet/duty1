package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AtAgentGame;
import generator.service.AtAgentGameService;
import generator.mapper.AtAgentGameMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_agent_game(代理游戏设置)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class AtAgentGameServiceImpl extends ServiceImpl<AtAgentGameMapper, AtAgentGame>
    implements AtAgentGameService{

}




