package com.stech.blog.repositories;

import com.stech.blog.entities.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 */
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
}
