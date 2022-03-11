package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.TempManDeposit;
import generator.service.TempManDepositService;
import generator.mapper.TempManDepositMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【temp_man_deposit(人工存入临时表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:17
*/
@Service
public class TempManDepositServiceImpl extends ServiceImpl<TempManDepositMapper, TempManDeposit>
    implements TempManDepositService{

}




