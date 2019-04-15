package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.Service;
import org.springframework.beans.factory.annotation.Autowired;


public class ServiceImpl implements Service {

    @Autowired
    private ItemsDao itemsDao;
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
