package com.main.user.service;

import java.util.List;

import com.main.testBatch.Users;
import com.main.user.bean.UserBean;
import com.main.user.model.User;

/**
 * 
 * <p>Title:   IUserService.java</p>
 * <p>Description:  �û�Service�ӿ� </p>
 * <p>Company:   www.edu24ol.com</p>
 * @author   pc-zw
 * @date     2015��8��20������5:43:41
 * @version  1.0
 */
public interface IUserService {

	/**
	 * �û��б��ѯ
	 * @param queryBean
	 * @return
	 */
	public List<User> searchUser(UserBean queryBean);
	
	
	/**
	 * �û�����
	 * @param user
	 */
	public void saveUser(User user);
}
