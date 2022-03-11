package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.AtAccountFavorites;
import generator.service.AtAccountFavoritesService;
import generator.mapper.AtAccountFavoritesMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_account_favorites(收藏信息表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:08
*/
@Service
public class AtAccountFavoritesServiceImpl extends ServiceImpl<AtAccountFavoritesMapper, AtAccountFavorites>
    implements AtAccountFavoritesService{

}




