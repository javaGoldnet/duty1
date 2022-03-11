package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.TtTest;
import generator.service.TtTestService;
import generator.mapper.TtTestMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【tt_test】的数据库操作Service实现
* @createDate 2022-03-11 15:55:18
*/
@Service
public class TtTestServiceImpl extends ServiceImpl<TtTestMapper, TtTest>
    implements TtTestService{

}




