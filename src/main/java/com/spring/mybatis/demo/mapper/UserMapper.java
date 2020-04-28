package com.spring.mybatis.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.spring.mybatis.demo.controller.Users;

@Mapper
public interface UserMapper {

	@Select("select * from Users")
	List<Users> findAll();
	
	

}
