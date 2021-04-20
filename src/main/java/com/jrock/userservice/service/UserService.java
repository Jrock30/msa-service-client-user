package com.jrock.userservice.service;

import com.jrock.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
