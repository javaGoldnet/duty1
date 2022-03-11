package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.PayExceptionOrder;
import generator.service.PayExceptionOrderService;
import generator.mapper.PayExceptionOrderMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【pay_exception_order(入款异常订单表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:14
*/
@Service
public class PayExceptionOrderServiceImpl extends ServiceImpl<PayExceptionOrderMapper, PayExceptionOrder>
    implements PayExceptionOrderService{

}




