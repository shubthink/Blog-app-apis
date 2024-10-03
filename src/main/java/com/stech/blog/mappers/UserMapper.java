package com.stech.blog.mappers;

/*
 */

import com.stech.blog.dto.UserDto;
import com.stech.blog.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToUserDto(UserEntity userEntity);

    UserEntity userDtoToUser(UserDto userDto);
}
