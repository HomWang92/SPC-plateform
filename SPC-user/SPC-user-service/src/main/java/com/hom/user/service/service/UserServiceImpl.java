package com.hom.user.service.service;

import com.hom.user.api.UserService;
import com.hom.user.api.dto.PermissionDto;
import com.hom.user.api.dto.UserDto;
import org.apache.dubbo.config.annotation.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by Hom_Wang on 2020-04-28.
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public UserDto getUserByUsername(String userName) {
        UserDto userDto = new UserDto("1", "1", "1", "1", "1");
        return userDto;
    }

    @Override
    public List<String> findPermissionsByUserId(String username) {
        return Collections.emptyList();
    }
}
