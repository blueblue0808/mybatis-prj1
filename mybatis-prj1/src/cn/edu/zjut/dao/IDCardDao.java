package cn.edu.zjut.dao;

import org.apache.ibatis.annotations.Mapper;
import cn.edu.zjut.po.IDcard;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IDCardDao {
    public IDcard selectCodeById(Integer id);
}