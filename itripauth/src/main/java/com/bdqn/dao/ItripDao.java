package com.bdqn.dao;

import com.bdqn.pojo.ItripHotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItripDao {

    public List<ItripHotel> list(@Param("index") int index);
    public List<ItripHotel> list1();
    public int count();
}
