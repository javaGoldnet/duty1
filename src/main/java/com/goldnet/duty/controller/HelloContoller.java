package com.goldnet.duty.controller;


import com.goldnet.duty.entity.GeStation;
import com.goldnet.duty.mapper.GeStationMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloContoller {

    public HelloContoller(GeStationMapper geStationMapper) {
        this.geStationMapper = geStationMapper;
    }

    private GeStationMapper geStationMapper;

    @GetMapping("/hello")
    @ResponseBody
    public List<GeStation> getStation(){
       return  geStationMapper.selectList(null);

    }

}
