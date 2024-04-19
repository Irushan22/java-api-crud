package com.javacrudapi.crud.service;

import com.javacrudapi.crud.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);
}
