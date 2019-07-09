package com.atguigu.gmall.manager;

import com.atguigu.gmall.manager.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 1.导入mybatis-plus的starter
 * 2.编写javabean，编写mapper接口（继承baseMapper）
 * 3.mapperScan（“com.atguigu.gmall.manager.mapper”）
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManagerServiceApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        for (User user: userMapper.selectList(null)) {
            System.out.println(user);
        }

        User user=new User();
        user.setAge(20);
        user.setName("Jack");
        User userHaha =userMapper.getUserByHaha(user);
        System.out.println(userHaha);

    }

}
