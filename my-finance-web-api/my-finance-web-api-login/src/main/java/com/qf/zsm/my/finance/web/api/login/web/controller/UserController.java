package com.qf.zsm.my.finance.web.api.login.web.controller;

import com.qf.zsm.commons.BaseResult;
import com.qf.zsm.domain.User;
import com.qf.zsm.my.finance.web.api.login.dto.UserDto;
import com.qf.zsm.my.finance.web.api.login.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller层返回一个json格式的对象
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //查询:返回自定义BaseResult类型的json格式的数据
    @RequestMapping("/loginToIndex")
    public BaseResult loginToIndex(String loginName,String userBindTelNo,String loginPassword){
        //查询出user
        User user = userService.loginToIndex(loginName, userBindTelNo,loginPassword);

        //创建UserDto对象,把查询出的User的数据拷贝的到UserDto对象中
        UserDto userDto = new UserDto();

        //spring提供的bean工具类的copyProperties方法
        BeanUtils.copyProperties(user,userDto);

        return BaseResult.success("返回user成功",userDto);
    }

    //新增:注册一个用户返回受影响的行数
    @RequestMapping("/registerUser")
    public int registerUser(String loginName,String userBindTelNo,String loginPassword){

        int rows = userService.registerUser(loginName, loginPassword, userBindTelNo);

        return rows;
    }
}
