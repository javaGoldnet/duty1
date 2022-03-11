package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.VasRecord;
import generator.service.VasRecordService;
import generator.mapper.VasRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【vas_record(加值平台流水表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:19
*/
@Service
public class VasRecordServiceImpl extends ServiceImpl<VasRecordMapper, VasRecord>
    implements VasRecordService{

}




