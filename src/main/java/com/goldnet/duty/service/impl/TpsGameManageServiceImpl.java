package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.TpsGameManage;
import generator.service.TpsGameManageService;
import generator.mapper.TpsGameManageMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【tps_game_manage(游戏分类管理基础表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:18
*/
@Service
public class TpsGameManageServiceImpl extends ServiceImpl<TpsGameManageMapper, TpsGameManage>
    implements TpsGameManageService{

}




