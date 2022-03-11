package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.MnyPeriods;
import generator.service.MnyPeriodsService;
import generator.mapper.MnyPeriodsMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【mny_periods(期数管理表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:14
*/
@Service
public class MnyPeriodsServiceImpl extends ServiceImpl<MnyPeriodsMapper, MnyPeriods>
    implements MnyPeriodsService{

}




