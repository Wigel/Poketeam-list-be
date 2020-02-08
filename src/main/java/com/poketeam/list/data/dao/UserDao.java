package com.poketeam.list.data.dao;

import com.poketeam.list.data.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserDto, String> {


}
