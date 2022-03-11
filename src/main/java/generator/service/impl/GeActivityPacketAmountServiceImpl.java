package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.GeActivityPacketAmount;
import generator.service.GeActivityPacketAmountService;
import generator.mapper.GeActivityPacketAmountMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_activity_packet_amount(红包金额表)】的数据库操作Service实现
* @createDate 2022-03-11 15:55:11
*/
@Service
public class GeActivityPacketAmountServiceImpl extends ServiceImpl<GeActivityPacketAmountMapper, GeActivityPacketAmount>
    implements GeActivityPacketAmountService{

}




