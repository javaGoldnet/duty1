package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeSeries;
import generator.service.GeSeriesService;
import generator.mapper.GeSeriesMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_series(系列表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:12
*/
@Service
public class GeSeriesServiceImpl extends ServiceImpl<GeSeriesMapper, GeSeries>
    implements GeSeriesService{

}




