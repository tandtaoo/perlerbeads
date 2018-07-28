package com.chashaotao.perlerbeads.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chashaotao.perlerbeads.dao.IUserDao;
import com.chashaotao.perlerbeads.pojo.User;
import com.chashaotao.perlerbeads.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	
}
