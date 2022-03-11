package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.Bbtest;
import generator.service.BbtestService;
import generator.mapper.BbtestMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【bbtest】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class BbtestServiceImpl extends ServiceImpl<BbtestMapper, Bbtest>
    implements BbtestService{

}




