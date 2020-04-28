package com.spring.mybatis.demo.MybatisDemo;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spring.mybatis.demo.controller.Users;


@MappedTypes(Users.class)
@MapperScan("com.spring.mybatis.demo.mapper")
@SpringBootApplication
@ComponentScan(basePackages= {"com.spring.mybatis.demo"})
public class MybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoApplication.class, args);
		System.out.println("MyBatis Demo");
	}

}
