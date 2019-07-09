package com.atguigu.gmall.manager.mapper;

import com.atguigu.gmall.manager.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {
    /**
     * mapper映射这个方法
     * @param user
     * @return
     */
    public User getUserByHaha( User user);
}
