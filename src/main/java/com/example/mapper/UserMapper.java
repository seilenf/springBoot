package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    //@Select("select * from user where id= #{id}")
    User Sel(int id);
}
