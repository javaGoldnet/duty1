package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.MsTemplate;
import generator.service.MsTemplateService;
import generator.mapper.MsTemplateMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ms_template(模板表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:14
*/
@Service
public class MsTemplateServiceImpl extends ServiceImpl<MsTemplateMapper, MsTemplate>
    implements MsTemplateService{

}




