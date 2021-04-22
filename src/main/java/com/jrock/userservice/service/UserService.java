package com.jrock.userservice.service;

import com.jrock.userservice.dto.UserDto;
import com.jrock.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();

}
