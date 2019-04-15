package com.itheima.test;


import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void findById() {

        //获取spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容其中拿到需要的代理对象
        ItemsDao itemsdao = context.getBean(ItemsDao.class);
        Items items = itemsdao.findById(1);
        System.out.println(items.getName());
    }


}
