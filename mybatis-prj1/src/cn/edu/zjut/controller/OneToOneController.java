package cn.edu.zjut.controller;

import cn.edu.zjut.dao.OrderDao;
import cn.edu.zjut.dao.PersonDao;
import cn.edu.zjut.dao.UserDao;
import cn.edu.zjut.po.MyUser;
import cn.edu.zjut.po.Order;
import cn.edu.zjut.po.Person;
import cn.edu.zjut.pojo.SelectPersonById;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class OneToOneController {
    private PersonDao personDao ;
    private OrderDao orderDao ;
    public void test(){
        try {
            InputStream config= Resources.
                    getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf=
                    new SqlSessionFactoryBuilder().build(config);
            SqlSession ss=ssf.openSession();
//            PersonDao personDao = ss.getMapper(PersonDao.class);
//            Person p1 = personDao.selectPersonById1(1) ;
//            System.out.println(p1) ;
//            System.out.println("====================") ;
//            Person p2 = personDao.selectPersonById2(1) ;
//            System.out.println(p2) ;
//            System.out.println("====================") ;
//            SelectPersonById p3 = personDao.selectPersonById3(1) ;
//            System.out.println(p3) ;
            UserDao userDao = ss.getMapper(UserDao.class);
            MyUser u = userDao.listWithOrder1(1) ;
            System.out.println(u) ;
            OrderDao orderDao = ss.getMapper(OrderDao.class);
            List<Order> o = orderDao.listWithUser(1) ;
            for(Order order:o)
            {
                System.out.println(o) ;
            }

//            System.out.println("====================") ;
//            Person p2 = personDao.selectPersonById2(1) ;
//            System.out.println(p2) ;
//            System.out.println("====================") ;
//            SelectPersonById p3 = personDao.selectPersonById3(1) ;
//            System.out.println(p3) ;
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

