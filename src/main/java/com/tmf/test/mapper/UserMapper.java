package com.tmf.test.mapper;

import com.tmf.test.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

   int login(User user);
}
