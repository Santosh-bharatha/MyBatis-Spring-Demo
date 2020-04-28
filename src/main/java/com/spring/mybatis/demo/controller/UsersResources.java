package com.spring.mybatis.demo.controller;

import java.util.List;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mybatis.demo.mapper.UserMapper;

@RestController
@RequestMapping("/rest/users")
public class UsersResources {
	
	private UserMapper userMapper;
	
	public UsersResources(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }

    
    
	@GetMapping("/all")
	public List<Users> getAll(){
		return userMapper.findAll();
	}
	
	@GetMapping("/hello")  
	public String hello() {   
	 return "Hello, world"; 
	 }
	

}
