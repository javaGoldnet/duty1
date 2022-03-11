package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.CampaignSiteMapping;
import generator.service.CampaignSiteMappingService;
import generator.mapper.CampaignSiteMappingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【campaign_site_mapping(活动站点映射表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:09
*/
@Service
public class CampaignSiteMappingServiceImpl extends ServiceImpl<CampaignSiteMappingMapper, CampaignSiteMapping>
    implements CampaignSiteMappingService{

}




