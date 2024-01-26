package cn.edu.zjut.po;

import org.apache.tools.ant.taskdefs.condition.Or;

import java.util.List;

public class MyUser implements java.io.Serializable{
    private int uid;
    private String uname;
    private String usex;
    private List<Order> orderList;
    public MyUser(){

    };
    public MyUser(int uid,String uname,String usex){
        this.uid=uid;
        this.uname=uname;
        this.usex=usex;
    }
    public int getUid() {
        return uid;
    };

    public String getUname() {
        return uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public String toString() {
        String x="User [uid=" + uid + ", uname=" + uname +
               ",order:";
        for (Order order:orderList) {
            String y=String.valueOf(order.getOrderId());
            x+=y;
            x+=" ";
        }
        return x;
    }
}
