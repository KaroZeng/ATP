package cn.karo.ATP.core.shiro.service.impl;

import javax.annotation.Resource;

import cn.karo.ATP.core.shiro.dao.UserMapper;
import cn.karo.ATP.core.shiro.entities.User;
import cn.karo.ATP.core.shiro.service.UserService;

public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User findByUserName(String username) {
		return userMapper.findByUserName(username);
	}
	
	

}
