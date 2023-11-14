package com.example.mshd_project.core.service;

import com.example.mshd_project.core.dao.UserMapper;
import com.example.mshd_project.core.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {

    User selectByName(String userName);

    int insert(User user);

    int updatePwd(String username, String md5Encode);
}
