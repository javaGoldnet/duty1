package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysQuestion;
import generator.service.SysQuestionService;
import generator.mapper.SysQuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_question(常见问题表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class SysQuestionServiceImpl extends ServiceImpl<SysQuestionMapper, SysQuestion>
    implements SysQuestionService{

}




