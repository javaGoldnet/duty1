package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.MnyMerchantRecord;
import generator.service.MnyMerchantRecordService;
import generator.mapper.MnyMerchantRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【mny_merchant_record(第三方支付流水表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:14
*/
@Service
public class MnyMerchantRecordServiceImpl extends ServiceImpl<MnyMerchantRecordMapper, MnyMerchantRecord>
    implements MnyMerchantRecordService{

}




