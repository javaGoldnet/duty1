package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.Cateid;
import generator.service.CateidService;
import generator.mapper.CateidMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【cateid】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class CateidServiceImpl extends ServiceImpl<CateidMapper, Cateid>
    implements CateidService{

}




