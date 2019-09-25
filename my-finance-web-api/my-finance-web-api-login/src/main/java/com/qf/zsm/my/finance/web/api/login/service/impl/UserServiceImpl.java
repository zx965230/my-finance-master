package com.qf.zsm.my.finance.web.api.login.service.impl;

import com.qf.zsm.domain.User;
import com.qf.zsm.my.finance.web.api.login.dao.UserDao;
import com.qf.zsm.my.finance.web.api.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User loginToIndex(String loginName, String userBindTelNo, String loginPassword) {

        //返回user对象
        return userDao.getUser(loginName,userBindTelNo,loginPassword);
    }

    @Override
    public int registerUser(String loginName, String userBindTelNo, String loginPassword) {

        int rows = userDao.addUser(loginName, userBindTelNo, loginPassword);

        //返回注册user后受影响的行数
        return rows;
    }
}
