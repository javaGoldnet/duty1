package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.MongoPie;
import generator.service.MongoPieService;
import generator.mapper.MongoPieMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【mongo_pie】的数据库操作Service实现
* @createDate 2022-03-11 15:55:14
*/
@Service
public class MongoPieServiceImpl extends ServiceImpl<MongoPieMapper, MongoPie>
    implements MongoPieService{

}




