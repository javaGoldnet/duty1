package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.WiDoc;
import generator.service.WiDocService;
import generator.mapper.WiDocMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【wi_doc(案件表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:19
*/
@Service
public class WiDocServiceImpl extends ServiceImpl<WiDocMapper, WiDoc>
    implements WiDocService{

}




