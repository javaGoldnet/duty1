package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.Test;
import generator.service.TestService;
import generator.mapper.TestMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【test】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test>
    implements TestService{

}




