package com.qf.zsm.my.finance.web.api.login.service;

import com.qf.zsm.domain.User;

public interface UserService {

    public User loginToIndex(String loginName,String userBindTelNo,String loginPassword);

    public int registerUser(String loginName,String userBindTelNo,String loginPassword);
}
