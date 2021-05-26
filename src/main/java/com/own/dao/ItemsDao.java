package com.own.dao;

import com.own.pojo.Items;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zy牧
 * @Description ItemsDao
 * @date 2021/5/25 17:44
 */
public interface ItemsDao {

    /***
     * 查询所有
     * @return
     */
    List<Items> findAll();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);


    public void aa();
}
