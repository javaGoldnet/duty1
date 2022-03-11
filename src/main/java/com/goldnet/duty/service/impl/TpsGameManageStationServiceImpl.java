package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.TpsGameManageStation;
import generator.service.TpsGameManageStationService;
import generator.mapper.TpsGameManageStationMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【tps_game_manage_station(游戏分类厅主关联表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:18
*/
@Service
public class TpsGameManageStationServiceImpl extends ServiceImpl<TpsGameManageStationMapper, TpsGameManageStation>
    implements TpsGameManageStationService{

}




