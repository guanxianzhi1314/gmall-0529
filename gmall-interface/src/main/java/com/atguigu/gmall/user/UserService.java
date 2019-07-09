package com.atguigu.gmall.user;

public interface UserService {

    public User getUser(String id);

    /**
     * 购买电影
     * @param uid 用户ID
     * @param mid 电影ID
     */
    public void buyMovie(String uid,String mid);
}
