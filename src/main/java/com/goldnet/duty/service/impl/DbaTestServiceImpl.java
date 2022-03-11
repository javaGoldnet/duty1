package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.DbaTest;
import generator.service.DbaTestService;
import generator.mapper.DbaTestMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【dba_test】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class DbaTestServiceImpl extends ServiceImpl<DbaTestMapper, DbaTest>
    implements DbaTestService{

}




