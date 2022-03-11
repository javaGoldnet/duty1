package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeGameType;
import generator.service.GeGameTypeService;
import generator.mapper.GeGameTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_game_type(游戏)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeGameTypeServiceImpl extends ServiceImpl<GeGameTypeMapper, GeGameType>
    implements GeGameTypeService{

}




