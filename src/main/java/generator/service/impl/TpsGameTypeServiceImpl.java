package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.TpsGameType;
import generator.service.TpsGameTypeService;
import generator.mapper.TpsGameTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【tps_game_type】的数据库操作Service实现
* @createDate 2022-03-11 15:55:18
*/
@Service
public class TpsGameTypeServiceImpl extends ServiceImpl<TpsGameTypeMapper, TpsGameType>
    implements TpsGameTypeService{

}




