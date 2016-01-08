package com.main.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.main.user.bean.UserBean;
import com.main.user.dao.IUserDao;
import com.main.user.model.User;
import com.main.user.service.IUserService;

/**
 * 
 * <p>Title:   UserServiceImpl.java</p>
 * <p>Description:  �û�serviceʵ�� </p>
 * <p>Company:   www.edu24ol.com</p>
 * @author   pc-zw
 * @date     2015��8��20������6:55:45
 * @version  1.0
 */
@Service
public class UserServiceImpl implements IUserService{
	
	@Resource
	private IUserDao userDaoImpl;

	@Override
	public List<User> searchUser(UserBean queryBean) {
		return userDaoImpl.searchUser(queryBean);		
	}

	@Override
	public void saveUser(User user) {
		userDaoImpl.saveUser(user);
	}

}
