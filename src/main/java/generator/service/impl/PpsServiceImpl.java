package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.Pps;
import generator.service.PpsService;
import generator.mapper.PpsMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【pps】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class PpsServiceImpl extends ServiceImpl<PpsMapper, Pps>
    implements PpsService{

}




