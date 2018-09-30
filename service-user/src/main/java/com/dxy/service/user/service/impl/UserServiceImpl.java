package com.dxy.service.user.service.impl;

import com.dxy.service.impl.BaseServiceImpl;
import com.dxy.service.user.model.User;
import com.dxy.service.user.respostry.UserRepository;
import com.dxy.service.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author zhougaojun
 * @since 2018/09/27
 **/
@Service
public class UserServiceImpl extends BaseServiceImpl<UserRepository, User, Long> implements UserService {
}

 