package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AtCurrentRecord;
import generator.service.AtCurrentRecordService;
import generator.mapper.AtCurrentRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_current_record(往来记录)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class AtCurrentRecordServiceImpl extends ServiceImpl<AtCurrentRecordMapper, AtCurrentRecord>
    implements AtCurrentRecordService{

}




