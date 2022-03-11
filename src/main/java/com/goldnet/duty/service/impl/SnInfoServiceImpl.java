package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SnInfo;
import generator.service.SnInfoService;
import generator.mapper.SnInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sn_info】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class SnInfoServiceImpl extends ServiceImpl<SnInfoMapper, SnInfo>
    implements SnInfoService{

}




