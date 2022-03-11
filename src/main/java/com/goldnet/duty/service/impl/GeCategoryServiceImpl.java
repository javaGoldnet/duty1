package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeCategory;
import generator.service.GeCategoryService;
import generator.mapper.GeCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_category(游戏分类【大类】)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeCategoryServiceImpl extends ServiceImpl<GeCategoryMapper, GeCategory>
    implements GeCategoryService{

}




