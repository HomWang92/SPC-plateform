package com.hom.user.api;

import com.hom.user.api.dto.PermissionDto;
import com.hom.user.api.dto.UserDto;

import java.util.List;

/**
 * Created by Hom_Wang on 2020-04-15.
 */
public interface UserService {


    public UserDto getUserByUsername(String userName);

    public List<String> findPermissionsByUserId(String username);
}
