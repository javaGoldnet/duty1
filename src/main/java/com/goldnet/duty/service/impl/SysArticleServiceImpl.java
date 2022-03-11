package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysArticle;
import generator.service.SysArticleService;
import generator.mapper.SysArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_article(文章管理表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class SysArticleServiceImpl extends ServiceImpl<SysArticleMapper, SysArticle>
    implements SysArticleService{

}




