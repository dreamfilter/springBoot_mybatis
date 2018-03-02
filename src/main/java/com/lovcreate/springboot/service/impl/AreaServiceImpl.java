package com.lovcreate.springboot.service.impl;

import com.lovcreate.springboot.dao.AreaDao;
import com.lovcreate.springboot.model.Area;
import com.lovcreate.springboot.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAll() {
        return areaDao.getAll();
    }

    @Override
    public Area getById(int areaId) {
        return areaDao.getById(areaId);
    }

    @Transactional
    @Override
    public Integer insetArea(Area area) {
        if (area.getAreaName() != null && area.getAreaName() !=""){
            return areaDao.insetArea(area);
        }
      return 0;
    }
}
