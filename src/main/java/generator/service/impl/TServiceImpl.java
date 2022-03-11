package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.T;
import generator.service.TService;
import generator.mapper.TMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【t】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class TServiceImpl extends ServiceImpl<TMapper, T>
    implements TService{

}




