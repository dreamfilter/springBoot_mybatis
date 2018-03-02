package com.lovcreate.springboot.dao;

import com.lovcreate.springboot.model.Area;

import java.util.List;

public interface AreaDao {

    List<Area> getAll();

    Area getById(int areaId);

    Integer insetArea(Area area);


}
