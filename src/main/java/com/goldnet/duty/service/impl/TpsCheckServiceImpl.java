package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.TpsCheck;
import com.goldnet.duty.service.TpsCheckService;
import com.goldnet.duty.mapper.TpsCheckMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【tps_check(稽核表，保存第三方相关的稽核数据)】的数据库操作Service实现
* @createDate 2022-03-11 16:36:00
*/
@Service
public class TpsCheckServiceImpl extends ServiceImpl<TpsCheckMapper, TpsCheck>
    implements TpsCheckService{

}




