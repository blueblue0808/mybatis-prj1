package cn.edu.zjut.po;

public class Order {
    private int orderId;
    private MyUser myUser;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public MyUser getMyUser() {
        return myUser;
    }

    public void setMyUser(MyUser myUser) {
        this.myUser = myUser;
    }
    public String toString() {
        return "User [uid=" + myUser.getUid() + ", uname=" + myUser.getUname() +
                ",order_id="+orderId;
    }
}
