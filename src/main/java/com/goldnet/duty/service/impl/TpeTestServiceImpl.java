package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.TpeTest;
import generator.service.TpeTestService;
import generator.mapper.TpeTestMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【tpe_test】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class TpeTestServiceImpl extends ServiceImpl<TpeTestMapper, TpeTest>
    implements TpeTestService{

}




