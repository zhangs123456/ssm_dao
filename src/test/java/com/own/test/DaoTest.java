package com.own.test;

import com.own.dao.ItemsDao;
import com.own.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author zy牧
 * @Description
 * @date 2021/5/25 17:53
 */
public class DaoTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao dao = (ItemsDao) context.getBean("itemsDao");
        System.out.println("商品列表：" + dao.findAll());

        Items items = new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        dao.save(items);


    }

}
