package org.example;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.session.SqlSession;
import org.example.bean.User;
import org.example.dao.UserDao;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}
