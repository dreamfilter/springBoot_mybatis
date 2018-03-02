package com.lovcreate.springboot.service;

import com.lovcreate.springboot.model.Area;

import java.util.List;

public interface AreaService {

    List<Area> getAll();

    Area getById(int areaId);

    Integer insetArea(Area area);
}
