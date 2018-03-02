package com.lovcreate.springboot.dao;

import com.lovcreate.springboot.model.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;
    @Test
    public void getAll() {
        List<Area> areaList=areaDao.getAll();
        areaList.forEach(area -> System.out.println(area.getAreaName()));

    }

    @Test
    public void getById() {
    }

    @Test
    public void insetArea() {
    }
}