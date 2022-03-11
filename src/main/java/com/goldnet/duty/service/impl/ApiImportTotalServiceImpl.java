package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ApiImportTotal;
import generator.service.ApiImportTotalService;
import generator.mapper.ApiImportTotalMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_import_total(注单导入汇总表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class ApiImportTotalServiceImpl extends ServiceImpl<ApiImportTotalMapper, ApiImportTotal>
    implements ApiImportTotalService{

}




