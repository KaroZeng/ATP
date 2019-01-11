package cn.karo.ATP.core.shiro.dao;

import org.apache.ibatis.annotations.Param;

import cn.karo.ATP.core.shiro.entities.User;

public interface UserMapper {

	public User findByUserName(@Param("username") String username);
	
	
}
