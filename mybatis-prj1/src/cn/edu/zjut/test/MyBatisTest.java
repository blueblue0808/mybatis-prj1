package cn.edu.zjut.test;
//import cn.edu.zjut.dao.UserDao;
import cn.edu.zjut.po.MyUser;
import cn.edu.zjut.pojo.MapUser;
import cn.edu.zjut.pojo.SelectUserParam;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {
    public static void main(String[] args){
        try {
            InputStream config= Resources.
                    getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf=
                    new SqlSessionFactoryBuilder().build(config);
            SqlSession ss=ssf.openSession();
//查询一个用户
//            MyUser mu = ss.selectOne("cn.edu.zjut.mapper.UserMapper.selectUserById", 1);
//            System.out.println(mu);
////添加一个用户
//            MyUser addmu=new MyUser();
//            addmu.setUname("张三");
//            addmu.setUsex("男");
//            ss.insert("cn.edu.zjut.mapper.UserMapper.addUser",addmu);
//
//            MapUser addmu=new MapUser();
//            addmu.setM_uname("张华");
//            addmu.setM_usex("男");
//            ss.insert("cn.edu.zjut.mapper.UserMapper.addParameterMap",addmu);
////修改一个用户
//            mu.setUsex("女");
//            mu.setUname("李四");
//            ss.update("cn.edu.zjut.mapper.UserMapper.updateUser",mu);

//            MapUser updatemu=new MapUser();
//            updatemu.setM_uid(1);
//            updatemu.setM_usex("女");
//            updatemu.setM_uname("老李");
//            ss.update("cn.edu.zjut.mapper.UserMapper.updateParameterMap",updatemu);

////删除一个用户
//            ss.delete("cn.edu.zjut.mapper.UserMapper.deleteUser",2);

            ss.delete("cn.edu.zjut.mapper.UserMapper.deleteParameterMap",11);

////查询所有用户
//            List<MyUser> myUserList = ss.selectList("cn.edu.zjut.mapper.UserMapper.selectAllUser");
//            for(MyUser myUser:myUserList){
//                System.out.println(myUser);
//            }

//            Map<String, Object> map=new HashMap<>();
//            map.put("u_name", "陈");
//            map.put("u_sex", "男");
//            List<MyUser> list=ss.selectList("cn.edu.zjut.mapper.UserMapper.selectAllUser",map);
//            for(MyUser myUser : list){
//                System.out.println(myUser);
//            }

//            Map<String, Object> map=new HashMap<>();
//            map.put("u_name", "陈");
//            map.put("u_sex", "男");
//            UserDao userDao = ss.getMapper(UserDao.class);
//            List<MyUser> list = userDao.selectAllUser(map);
//            for(MyUser myUser : list){
//                System.out.println(myUser);
//            }

//            SelectUserParam su = new SelectUserParam();
//            su.setU_name("陈");
//            su.setU_sex("男");
////            如果自己写了一个dao（即mapper），就可以用dao来调用函数，如果没有，就用mybatis自己的函数
//            List<MyUser> list=ss.selectList("cn.edu.zjut.mapper.UserMapper.selectAllUser",su);
//            for(MyUser myUser : list){
//                System.out.println(myUser);
//            }

//            List<Map<String, Object>> lmp=ss.selectList("cn.edu.zjut.mapper.UserMapper.selectAllUser");
//            for(Map myUser : lmp){
//                System.out.println(myUser);
//            }

//            List<MapUser> lmp=ss.selectList("cn.edu.zjut.mapper.UserMapper.selectResultMap");
//            for(MapUser myUser : lmp){
//                System.out.println(myUser);
//            }

            ss.commit();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}