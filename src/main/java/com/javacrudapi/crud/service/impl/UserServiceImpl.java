package com.javacrudapi.crud.service.impl;

import com.javacrudapi.crud.dto.UserDto;
import com.javacrudapi.crud.entity.User;
import com.javacrudapi.crud.exception.ResourceNotFoundException;
import com.javacrudapi.crud.mapper.UserMapper;
import com.javacrudapi.crud.repository.UserRepository;
import com.javacrudapi.crud.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);

    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("user id is not exist" + userId));

        return UserMapper.mapToUserDto(user);
    }
}
