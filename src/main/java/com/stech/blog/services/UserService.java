package com.stech.blog.services;

import com.stech.blog.dto.UserDto;
import com.stech.blog.entities.UserEntity;
import com.stech.blog.mappers.UserMapper;
import com.stech.blog.repositories.UserRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 */

@Service
public class UserService {

    @Autowired
    private  UserRepo userRepo;
    @Autowired
    private  UserMapper userMapper;

//    @Autowired
//    public UserService(UserRepo userRepo, UserMapper userMapper) {
//        this.userRepo = userRepo;
//        this.userMapper = userMapper;
//    }

    public UserDto createUser(UserDto userDto) {
        UserEntity user = userMapper.userDtoToUser(userDto);
        UserEntity save = userRepo.save(user);
        return userMapper.userToUserDto(save);
    }

//    public UserDto createUser(UserDto userDto) {
//        UserEntity user = this.dtoToUser(userDto);
//        UserEntity savedUser = this.userRepo.save(user);
//        return this.userToDto(savedUser);
//    }
//
//        private UserEntity dtoToUser(UserDto userdto) {
//
//        UserEntity user = new UserEntity();
//        user.setId(userdto.getId());
//        user.setFirstName(userdto.getFirstName());
//        user.setLastName(userdto.getLastName());
//        user.setEmail(userdto.getEmail());
//        user.setPassword(userdto.getPassword());
//        user.setAbout(userdto.getAbout());
//        return user;
//    }
//
//    public UserDto userToDto(UserEntity user) {
//        UserDto userdto = new UserDto();
//        userdto.setId(user.getId());
//        userdto.setFirstName(user.getFirstName());
//        userdto.setLastName(user.getLastName());
//        userdto.setEmail(user.getEmail());
//        userdto.setPassword(user.getPassword());
//        userdto.setAbout(user.getAbout());
//        return userdto;
//    }
}
