package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.MnyDocKind;
import generator.service.MnyDocKindService;
import generator.mapper.MnyDocKindMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【mny_doc_kind(案件种类表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:13
*/
@Service
public class MnyDocKindServiceImpl extends ServiceImpl<MnyDocKindMapper, MnyDocKind>
    implements MnyDocKindService{

}




