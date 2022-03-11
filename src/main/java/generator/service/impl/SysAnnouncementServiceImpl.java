package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.SysAnnouncement;
import generator.service.SysAnnouncementService;
import generator.mapper.SysAnnouncementMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_announcement(所有公告【总控的公告管理：包含一般公告、系统公告、维护公告、推广公告】)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:15
*/
@Service
public class SysAnnouncementServiceImpl extends ServiceImpl<SysAnnouncementMapper, SysAnnouncement>
    implements SysAnnouncementService{

}




