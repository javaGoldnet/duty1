package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysArticleCategory;
import generator.service.SysArticleCategoryService;
import generator.mapper.SysArticleCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_article_category(文章分类表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class SysArticleCategoryServiceImpl extends ServiceImpl<SysArticleCategoryMapper, SysArticleCategory>
    implements SysArticleCategoryService{

}




