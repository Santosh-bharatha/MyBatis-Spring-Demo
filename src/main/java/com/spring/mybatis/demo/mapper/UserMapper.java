package com.spring.mybatis.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.spring.mybatis.demo.controller.Users;

@Mapper
public interface UserMapper {

	@Select("select * from data")
	List<Users> findAll();
	
	@Insert("Insert into data(name, salary) values (#{name}, #{salary})")
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
	void insert(Users users);
	

}
