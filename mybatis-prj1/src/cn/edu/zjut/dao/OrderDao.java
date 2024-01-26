package cn.edu.zjut.dao;

import cn.edu.zjut.po.Order;

import java.util.List;

public interface OrderDao {
    Order selectOrderById1(int i);
    List<Order> listWithUser(int i);
}
