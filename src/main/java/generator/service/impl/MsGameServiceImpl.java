package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.MsGame;
import generator.service.MsGameService;
import generator.mapper.MsGameMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ms_game(游戏平台表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:14
*/
@Service
public class MsGameServiceImpl extends ServiceImpl<MsGameMapper, MsGame>
    implements MsGameService{

}




