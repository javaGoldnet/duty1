package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.TpsEventDetails;
import generator.service.TpsEventDetailsService;
import generator.mapper.TpsEventDetailsMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【tps_event_details】的数据库操作Service实现
* @createDate 2022-03-11 15:55:18
*/
@Service
public class TpsEventDetailsServiceImpl extends ServiceImpl<TpsEventDetailsMapper, TpsEventDetails>
    implements TpsEventDetailsService{

}




