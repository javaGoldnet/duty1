package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.CampaignReceiveRecord;
import generator.service.CampaignReceiveRecordService;
import generator.mapper.CampaignReceiveRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【campaign_receive_record(领取记录)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class CampaignReceiveRecordServiceImpl extends ServiceImpl<CampaignReceiveRecordMapper, CampaignReceiveRecord>
    implements CampaignReceiveRecordService{

}




