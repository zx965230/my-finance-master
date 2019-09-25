package com.qf.zsm.my.finance.web.api.login.dao;

import com.qf.zsm.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    //根据登陆账号和登陆密码查询用户
     User getUser(@Param("loginName") String loginName, @Param("userBindTelNo")String userBindTelNo, @Param("loginPassword")String loginPassword);
    //注册用户
     int addUser(@Param("loginName")String loginName,@Param("userBindTelNo")String userBindTelNo,@Param("loginPassword")String loginPassword);
}
