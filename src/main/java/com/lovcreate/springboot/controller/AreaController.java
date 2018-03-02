package com.lovcreate.springboot.controller;

import com.lovcreate.springboot.model.Area;
import com.lovcreate.springboot.service.AreaService;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("listArea")
    public Map<String,Object> listArea(){
        Map<String,Object> areaMap=new HashMap<>();
        List<Area> areaList=areaService.getAll();
        areaMap.put("areaList",areaList);
        return areaMap;
    }
}
