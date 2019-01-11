package cn.karo.ATP.core.shiro.service;

import cn.karo.ATP.core.shiro.entities.User;

public interface UserService {
	
	public User findByUserName(String username);

}
