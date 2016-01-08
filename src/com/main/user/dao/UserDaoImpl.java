package com.main.user.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.main.user.bean.UserBean;
import com.main.user.model.User;

/**
 * 
 * <p>Title:   UserDaoImpl.java</p>
 * <p>Description:  UserDaoʵ���� </p>
 * <p>Company:   www.edu24ol.com</p>
 * @author   pc-zw
 * @date     2015��8��20������6:48:54
 * @version  1.0
 */
@Repository
public class UserDaoImpl implements IUserDao{

	@Resource
	private SqlSessionFactory sqlSessionFactory;
	
	@Override
	public List<User> searchUser(UserBean queryBean) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> users = sqlSession.selectList("user.searchUser",queryBean);
		return users;
	}

	@Override
	public void saveUser(User user) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("user.saveUser",user);
	}

}
