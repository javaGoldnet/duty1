package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeQuestion;
import generator.service.GeQuestionService;
import generator.mapper.GeQuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_question(问题表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:12
*/
@Service
public class GeQuestionServiceImpl extends ServiceImpl<GeQuestionMapper, GeQuestion>
    implements GeQuestionService{

}




