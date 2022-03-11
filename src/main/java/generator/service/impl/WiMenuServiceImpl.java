package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.WiMenu;
import generator.service.WiMenuService;
import generator.mapper.WiMenuMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【wi_menu(目录表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:20
*/
@Service
public class WiMenuServiceImpl extends ServiceImpl<WiMenuMapper, WiMenu>
    implements WiMenuService{

}




