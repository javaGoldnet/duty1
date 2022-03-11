package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AppPackAddressManager;
import generator.service.AppPackAddressManagerService;
import generator.mapper.AppPackAddressManagerMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_pack_address_manager(下载包地址管理)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AppPackAddressManagerServiceImpl extends ServiceImpl<AppPackAddressManagerMapper, AppPackAddressManager>
    implements AppPackAddressManagerService{

}




