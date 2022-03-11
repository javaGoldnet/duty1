package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.WiDocKind;
import generator.service.WiDocKindService;
import generator.mapper.WiDocKindMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【wi_doc_kind(案件种类)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:19
*/
@Service
public class WiDocKindServiceImpl extends ServiceImpl<WiDocKindMapper, WiDocKind>
    implements WiDocKindService{

}




