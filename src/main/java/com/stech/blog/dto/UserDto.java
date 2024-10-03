package com.stech.blog.dto;

/*
 */

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  UserDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String about;
}
