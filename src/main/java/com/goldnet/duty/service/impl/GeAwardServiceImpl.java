package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeAward;
import generator.service.GeAwardService;
import generator.mapper.GeAwardMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_award(开奖结果)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeAwardServiceImpl extends ServiceImpl<GeAwardMapper, GeAward>
    implements GeAwardService{

}




