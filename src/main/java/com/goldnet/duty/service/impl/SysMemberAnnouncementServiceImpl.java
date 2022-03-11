package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysMemberAnnouncement;
import generator.service.SysMemberAnnouncementService;
import generator.mapper.SysMemberAnnouncementMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_member_announcement(会员资讯管理表【最新消息、历史消息】)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:16
*/
@Service
public class SysMemberAnnouncementServiceImpl extends ServiceImpl<SysMemberAnnouncementMapper, SysMemberAnnouncement>
    implements SysMemberAnnouncementService{

}




